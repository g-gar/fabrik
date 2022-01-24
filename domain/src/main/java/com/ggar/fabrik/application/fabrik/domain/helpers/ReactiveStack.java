package com.ggar.fabrik.application.fabrik.domain.helpers;

import java.util.Stack;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;

public class ReactiveStack<E> extends Stack<E> {

	protected final Consumer<E> consumer;

	public ReactiveStack(Consumer<E> consumer) {
		this.consumer = consumer;
	}

	@Override
	public synchronized E push(E item) {
		E result = super.push(item);
		this.consumer.accept(item);
		return result;
	}

	@Override
	public synchronized E pop() {
		return super.pop();
	}

}
