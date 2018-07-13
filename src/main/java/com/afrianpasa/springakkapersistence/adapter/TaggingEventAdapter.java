package com.afrianpasa.springakkapersistence.adapter;

import org.omg.CORBA.Any;

import akka.persistence.journal.EventAdapter;
import akka.persistence.journal.EventSeq;
import akka.persistence.journal.Tagged;

public class TaggingEventAdapter implements EventAdapter{

	@Override
	public String manifest(Object event) {
		return "";
	}

	public Tagged tag(Any event, String tag) {
		return null;
	}
	
	@Override
	public Object toJournal(Object event) {
		return null;
	}

	@Override
	public EventSeq fromJournal(Object event, String manifest) {
		return null;
	}

}
