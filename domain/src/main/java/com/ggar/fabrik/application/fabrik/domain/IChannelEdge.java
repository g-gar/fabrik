package com.ggar.fabrik.application.fabrik.domain;

public interface IChannelEdge<E extends IChannelEdgeBehaviour> {
	public INode getStartNode();
	public INode getEndNode();
	public IChannelEdgeDetails getDetail();
}
