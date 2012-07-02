package org.hawknetwork.hawkrota.domain;

import java.util.List;

public class BandRota {
	private List<BandSlotAssignment> slotAssignmentList;

	public List<BandSlotAssignment> getSlotAssignmentList() {
		return slotAssignmentList;
	}

	public void setSlotAssignmentList(List<BandSlotAssignment> slotAssignmentList) {
		this.slotAssignmentList = slotAssignmentList;
	}
}
