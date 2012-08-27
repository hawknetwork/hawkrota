package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.Date;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class PreJob extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = 2326628629050045316L;
	private String headingName;
	private int numRequired;
	private Date arrivalTime;
	private boolean displayGroupName;
	private boolean conflictsWithBand;
	// Team Leader doesn't need to be a Person object because we don't need to cross-reference
	// with the job list - they can team lead as well as doing it (e.g. Kurigers supervisor team).
	// Making them a Person would be much more difficult because Person already depends on Job.
	private String teamLeader;
	public String getHeadingName() {
		return headingName;
	}
	public void setHeadingName(String headingName) {
		this.headingName = headingName;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public int getNumRequired() {
		return numRequired;
	}
	public void setNumRequired(int numRequired) {
		this.numRequired = numRequired;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public boolean isDisplayGroupName() {
		return displayGroupName;
	}
	public void setDisplayGroupName(boolean displayGroupName) {
		this.displayGroupName = displayGroupName;
	}
	public boolean isConflictsWithBand() {
		return conflictsWithBand;
	}
	public void setConflictsWithBand(boolean conflictsWithBand) {
		this.conflictsWithBand = conflictsWithBand;
	}
}
