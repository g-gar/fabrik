package com.ggar.fabrik.application.fabrik.domain;

import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;
import java.util.Iterator;

public interface INodeTraversalAlgorithm {

	public Iterator<INode> accept(Collection<IEvent> events);

}
