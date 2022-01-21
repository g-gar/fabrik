package com.ggar.fabrik.application.fabrik.domain;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface IPipeline {
	public IPipelineDetails getDetail();
	public IPipeline append(INode parent, IChannel channel);

	public void accept(IEvent... events);
}
