package com.ggar.fabrik.application.fabrik.domain;

import com.ggar.fabrik.application.fabrik.domain.node.INode;

public interface IChannelEdge<E extends IChannelEdgeBehaviour> {
	public INode getStartNode();
	public INode getEndNode();
	public IChannelEdgeDetails getDetail();
}
