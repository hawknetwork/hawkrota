package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

public class HolidayCalendar implements Serializable {
	private static final long serialVersionUID = -6759720036161256749L;
	private List<SlotAssignment> holidays;

	public List<SlotAssignment> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<SlotAssignment> holidays) {
		this.holidays = holidays;
	}
}
