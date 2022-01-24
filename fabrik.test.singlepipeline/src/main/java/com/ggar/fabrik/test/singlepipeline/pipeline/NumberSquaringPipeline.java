package com.ggar.fabrik.test.singlepipeline.pipeline;

import com.ggar.fabrik.application.fabrik.domain.IPipeline;
import com.ggar.fabrik.application.fabrik.domain.IPipelineDetails;
import com.ggar.fabrik.application.fabrik.domain.Pipeline;
import com.ggar.fabrik.application.fabrik.domain.channel.IChannel;
import com.ggar.fabrik.application.fabrik.domain.node.INode;

public class NumberSquaringPipeline extends Pipeline {
	@Override
	public IPipelineDetails getDetail() {
		return null;
	}

	@Override
	public IPipeline append(INode parent, IChannel channel) {
		return null;
	}
}
