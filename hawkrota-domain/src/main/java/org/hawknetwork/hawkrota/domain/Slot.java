package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

import org.hawknetwork.hawkrota.domain.base.BaseDomainClass;

public class Slot extends BaseDomainClass implements Serializable {
	private static final long serialVersionUID = 457257469845184808L;
	private Event event;
	private Job job;
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
}
