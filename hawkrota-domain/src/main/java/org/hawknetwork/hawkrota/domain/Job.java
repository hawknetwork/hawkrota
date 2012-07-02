package org.hawknetwork.hawkrota.domain;

import java.util.List;

public class Job {
	private PreJob preJob;
	private List<PreJob> preJobConflicts;
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
}
