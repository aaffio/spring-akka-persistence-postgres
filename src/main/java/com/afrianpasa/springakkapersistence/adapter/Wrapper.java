package com.afrianpasa.springakkapersistence.adapter;

import org.omg.CORBA.Any;

public class Wrapper {
	private Any payload;
	private Long created;
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Any getPayload() {
		return payload;
	}
	public void setPayload(Any payload) {
		this.payload = payload;
	}
	public Wrapper(Any payload, Long created) {
		super();
		this.payload = payload;
		this.created = created;
	}
}
