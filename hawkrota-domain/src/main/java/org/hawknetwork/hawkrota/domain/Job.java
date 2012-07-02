package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

public class Job implements Serializable {
	private static final long serialVersionUID = 4452301883947013530L;
	private PreJob preJob;
	private List<PreJob> preJobConflicts;
	private boolean displayGroupName;
	// Team Leader doesn't need to be a Person object because we don't need to cross-reference
	// with the job list - they can team lead as well as doing it (e.g. Kurigers supervisor team).
	// Making them a Person would be much more difficult because Person already depends on Job.
	private String teamLeader;
	public PreJob getPreJob() {
		return preJob;
	}
	public void setPreJob(PreJob preJob) {
		this.preJob = preJob;
	}
	public List<PreJob> getPreJobConflicts() {
		return preJobConflicts;
	}
	public void setPreJobConflicts(List<PreJob> preJobConflicts) {
		this.preJobConflicts = preJobConflicts;
	}
	public boolean isDisplayGroupName() {
		return displayGroupName;
	}
	public void setDisplayGroupName(boolean displayGroupName) {
		this.displayGroupName = displayGroupName;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
}
