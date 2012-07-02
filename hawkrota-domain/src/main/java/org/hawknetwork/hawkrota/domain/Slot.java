package org.hawknetwork.hawkrota.domain;

public class Slot {
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
