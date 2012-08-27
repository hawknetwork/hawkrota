package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class CoveredEvents extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = 1744801800763542969L;
	private List<Event> eventList;
	private Event firstEvent;
	private Event lastEvent;
	public List<Event> getEventList() {
		return eventList;
	}
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
	public Event getFirstEvent() {
		return firstEvent;
	}
	public void setFirstEvent(Event firstEvent) {
		this.firstEvent = firstEvent;
	}
	public Event getLastEvent() {
		return lastEvent;
	}
	public void setLastEvent(Event lastEvent) {
		this.lastEvent = lastEvent;
	}
}
