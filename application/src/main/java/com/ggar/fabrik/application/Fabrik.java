package com.ggar.fabrik.application;

import com.ggar.fabrik.application.fabrik.domain.*;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;

public class Fabrik implements IFabrik {

	private ExecutorService executorService;
	private IPipelineOrchestrator orchestrator;

	public Fabrik(ExecutorService executorService, IPipelineOrchestrator orchestrator) {
		this.executorService = executorService;
		this.orchestrator = orchestrator;
	}

	@Override
	public void registerPipeline(IPipeline pipeline) {
		this.orchestrator.addPipeline(pipeline);
	}

	@Override
	public void accept(IEvent... events) {
		IPipelineTraversalAlgorithm algorithm = orchestrator.getDetail().getPipelineTraversalAlgorithm();
		for (Iterator<IPipeline> it = algorithm.accept(events); it.hasNext(); ) {
			IPipeline pipeline = it.next();
			pipeline.accept(events);
		}
	}


}
