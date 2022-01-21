package com.ggar.fabrik.application.fabrik.domain;

import java.util.Iterator;

public interface IPipelineTraversalAlgorithm {

	public Iterator<IPipeline> accept(IEvent... events);

}
