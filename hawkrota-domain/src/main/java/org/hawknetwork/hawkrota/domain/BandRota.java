package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class BandRota extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = -503851675523427848L;
	private List<BandSlotAssignment> slotAssignmentList;

	public List<BandSlotAssignment> getSlotAssignmentList() {
		return slotAssignmentList;
	}

	public void setSlotAssignmentList(List<BandSlotAssignment> slotAssignmentList) {
		this.slotAssignmentList = slotAssignmentList;
	}
}
