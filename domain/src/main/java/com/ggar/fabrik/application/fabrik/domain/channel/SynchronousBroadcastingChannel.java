package com.ggar.fabrik.application.fabrik.domain.channel;

import com.ggar.fabrik.application.fabrik.domain.IChannelEdge;
import com.ggar.fabrik.application.fabrik.domain.IEvent;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

import java.util.Collection;

public class SynchronousBroadcastingChannel extends AbstractChannel {
	public SynchronousBroadcastingChannel(INode root, Collection<IChannelEdge> edges) {
		super(root, edges);
	}

	@Override
	public void accept(IEvent... events) {

	}
}
