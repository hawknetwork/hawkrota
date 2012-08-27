package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class Job extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = 4452301883947013530L;
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
