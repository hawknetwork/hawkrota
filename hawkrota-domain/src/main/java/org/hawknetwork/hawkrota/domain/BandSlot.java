package org.hawknetwork.hawkrota.domain;

public class BandSlot {
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
