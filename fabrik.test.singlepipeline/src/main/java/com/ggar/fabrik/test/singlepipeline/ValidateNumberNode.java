package com.ggar.fabrik.test.singlepipeline;

import com.ggar.fabrik.application.fabrik.domain.IEvent;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Future;

public class ValidateNumberNode implements INode<Boolean> {
	@Override
	public Boolean accept(Stack<Future> stack, Collection<IEvent> events) {
		return null;
	}

	@Override
	public Map<String, Object> getGeneratedVariables() {
		return null;
	}
}
