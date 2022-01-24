package com.ggar.fabrik.application.fabrik.domain.node;

import com.ggar.fabrik.application.fabrik.domain.IEvent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Future;

public interface INode<T> {
	public T accept(Stack<Future> stack,  Collection<IEvent> events);
	public Map<String, Object> getGeneratedVariables();
}
