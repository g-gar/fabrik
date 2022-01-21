package com.ggar.fabrik.application.fabrik.domain;

import java.util.Collection;

public interface IChannel {
	public Collection<IChannelEdge> getAvailableEdges();
	public Collection<INode> getNodes();
	public INode getRootNode();
}
