package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.Date;



public class Event implements Serializable {
	private static final long serialVersionUID = 2366452104947416895L;
	private Date eventDate;

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
}
