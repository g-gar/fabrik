package com.ggar.fabrik.application.fabrik.domain.channel;

import com.ggar.fabrik.application.fabrik.domain.IChannelEdge;
import com.ggar.fabrik.application.fabrik.domain.IEvent;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;

public interface IChannel {
	public Collection<IChannelEdge> getAvailableEdges();
	public Collection<INode> getNodes();
	public INode getRootNode();

	public void accept(IEvent... events);
}
