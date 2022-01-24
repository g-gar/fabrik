package com.ggar.fabrik.application.fabrik.domain;

import com.ggar.fabrik.application.fabrik.domain.helpers.ReactiveStack;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class Pipeline extends Thread implements IPipeline {

	protected final ExecutorService executorService;
	protected final ReactiveStack<Collection<IEvent>> eventStack;

	public Pipeline(ExecutorService executorService) {
		this.executorService = executorService;
		this.eventStack = new ReactiveStack<>(events -> this.run());
	}

	@Override
	public void accept(IEvent... events) {
		this.eventStack.push(Arrays.asList(events));
	}

	@Override
	public void run() {
		Collection<IEvent> events = this.eventStack.pop();

		Stack<Future> stack = new Stack<>();
		INodeTraversalAlgorithm algorithm = this.getDetail().getNodeTraversalAlgorithm();
		for (Iterator<INode> it = algorithm.accept(events); it.hasNext(); ) {
			INode node = it.next();
			Future future = executorService.submit(() -> node.accept(stack, events));
			stack.push(future);
		}
	}
}
