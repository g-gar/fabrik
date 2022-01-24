package com.ggar.fabrik.application.fabrik.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class PipelineOrchestrator implements IPipelineOrchestrator {

	protected final Collection<IPipeline> pipelines;

	protected PipelineOrchestrator() {
		this.pipelines = new ArrayList<>();
	}


	@Override
	public IPipelineOrchestrator addPipeline(IPipeline pipeline) {
		this.pipelines.add(pipeline);
		return this;
	}

	@Override
	public void accept(IEvent... events) {
		IPipelineTraversalAlgorithm algorithm = this.getDetail().getPipelineTraversalAlgorithm();
		for (Iterator<IPipeline> it = algorithm.accept(events); it.hasNext(); ) {
			IPipeline pipeline = it.next();
			pipeline.accept(events);
		}
	}
}
