package com.ggar.fabrik.test.singlepipeline.pipeline;

import com.ggar.fabrik.application.fabrik.domain.*;

public class NumberSquaringPipelineDetails implements IPipelineDetails {
	@Override
	public int getIdentifier() {
		return 0;
	}

	@Override
	public State getState() {
		return null;
	}

	@Override
	public IPipelineContext getContext() {
		return null;
	}

	@Override
	public IPipelineInputFilter getPipelineEventFilter() {
		return null;
	}

	@Override
	public INodeTraversalAlgorithm getNodeTraversalAlgorithm() {
		return null;
	}
}
