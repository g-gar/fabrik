package com.ggar.fabrik.application.fabrik.domain;

import java.util.Collection;

public interface IPipelineOrchestrator {
	public IPipelineOrchestratorDetails getDetail();
	public State getCurrentState();
	public IPipelineOrchestrator addPipeline(IPipeline pipeline);

	public IPipelineOrchestrator start(IPipeline... pipelines);
	public IPipelineOrchestrator pause(IPipeline... pipelines);
	public IPipelineOrchestrator stop(IPipeline... pipelines);
	public Collection<IPipeline> getPipelines();

	public void accept(IEvent... events);
}
