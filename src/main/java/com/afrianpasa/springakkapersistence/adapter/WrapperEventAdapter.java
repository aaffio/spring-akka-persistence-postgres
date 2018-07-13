package com.afrianpasa.springakkapersistence.adapter;

import org.slf4j.Logger;

import akka.persistence.journal.EventSeq;
import akka.persistence.journal.ReadEventAdapter;

public class WrapperEventAdapter implements ReadEventAdapter{

	@Override
	public EventSeq fromJournal(Object event, String manifest) {
		return EventSeq.create(event);
	}

}
