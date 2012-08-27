package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class HolidayCalendar extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = -6759720036161256749L;
	private List<SlotAssignment> holidays;

	public List<SlotAssignment> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<SlotAssignment> holidays) {
		this.holidays = holidays;
	}
}
