package org.hawknetwork.hawkrota.domain;

import java.util.List;

public class HolidayCalendar {
	private List<SlotAssignment> holidays;

	public List<SlotAssignment> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<SlotAssignment> holidays) {
		this.holidays = holidays;
	}
}
