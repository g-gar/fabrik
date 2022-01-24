package com.ggar.fabrik.application.fabrik.domain.channel;

import com.ggar.fabrik.application.fabrik.domain.IChannelEdge;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;
import java.util.stream.Collectors;

public class AbstractChannel implements IChannel {

	protected final INode root;
	protected final Collection<IChannelEdge> edges;

	public AbstractChannel(INode root, Collection<IChannelEdge> edges) {
		this.root = root;
		this.edges = edges;
	}

	@Override
	public Collection<IChannelEdge> getAvailableEdges() {
		return this.edges;
	}

	@Override
	public Collection<INode> getNodes() {
		return this.edges.stream().map(e -> e.getEndNode()).collect(Collectors.toList());
	}

	@Override
	public INode getRootNode() {
		return this.root;
	}
}
