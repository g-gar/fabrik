package com.ggar.fabrik.test.singlepipeline.event;

import com.ggar.fabrik.application.fabrik.domain.IEvent;

public class NumberSquaringEvent implements IEvent {

	private final Integer n;

	public NumberSquaringEvent(Integer n) {
		this.n = n;
	}

	public Integer getN() {
		return n;
	}
}
