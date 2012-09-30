package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;



public class Rota implements Serializable {
	private static final long serialVersionUID = 2325350960177021299L;
	private List<SlotAssignment> slotAssignmentList;

	public List<SlotAssignment> getSlotAssignmentList() {
		return slotAssignmentList;
	}

	public void setSlotAssignmentList(List<SlotAssignment> slotAssignmentList) {
		this.slotAssignmentList = slotAssignmentList;
	}
}
