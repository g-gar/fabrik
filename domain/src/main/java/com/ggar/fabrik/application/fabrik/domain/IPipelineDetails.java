package com.ggar.fabrik.application.fabrik.domain;

public interface IPipelineDetails {
	public int getIdentifier();
	public State getState();
	public IPipelineGraph getGraph();
	public IPipelineInputFilter getPipelineEventFilter();
	public INodeTraversalAlgorithm getNodeTraversalAlgorithm();
}
