package com.ggar.fabrik.application;

import com.ggar.fabrik.application.fabrik.domain.IEvent;
import com.ggar.fabrik.application.fabrik.domain.IPipeline;

public interface IFabrik {
	public void registerPipeline(IPipeline pipeline);
	public void accept(IEvent... events);
}
