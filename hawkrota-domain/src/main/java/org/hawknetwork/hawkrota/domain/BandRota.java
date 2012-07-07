package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.hawkrota.domain.base.BaseDomainClass;

public class BandRota extends BaseDomainClass implements Serializable {
	private static final long serialVersionUID = -503851675523427848L;
	private List<BandSlotAssignment> slotAssignmentList;

	public List<BandSlotAssignment> getSlotAssignmentList() {
		return slotAssignmentList;
	}

	public void setSlotAssignmentList(List<BandSlotAssignment> slotAssignmentList) {
		this.slotAssignmentList = slotAssignmentList;
	}
}
