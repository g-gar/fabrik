package com.ggar.fabrik.application.fabrik.domain;

import com.ggar.fabrik.application.fabrik.domain.channel.IChannel;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

public interface IPipeline {
	public IPipelineDetails getDetail();
	public IPipeline append(INode parent, IChannel channel);

	public void accept(IEvent... events);
}
