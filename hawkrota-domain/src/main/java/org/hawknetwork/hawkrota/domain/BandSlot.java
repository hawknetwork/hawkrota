package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;



public class BandSlot implements Serializable {
	private static final long serialVersionUID = -7268684555265866960L;
	private Event event;
	private BandJob job;
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public BandJob getJob() {
		return job;
	}
	public void setJob(BandJob job) {
		this.job = job;
	}
}
