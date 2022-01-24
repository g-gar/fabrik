package com.ggar.fabrik.application.fabrik.domain.algorithm;

import com.ggar.fabrik.application.fabrik.domain.IEvent;
import com.ggar.fabrik.application.fabrik.domain.INodeTraversalAlgorithm;
import com.ggar.fabrik.application.fabrik.domain.IPipeline;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;
import java.util.Iterator;

public class BaseNodeTraversalAlgorithm implements INodeTraversalAlgorithm {

	private final IPipeline pipeline;

	public BaseNodeTraversalAlgorithm(IPipeline pipeline) {
		this.pipeline = pipeline;
	}

	@Override
	public Iterator<INode> accept(Collection<IEvent> events) {
		return null;
	}
}
