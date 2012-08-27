package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class JobList extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = -2124658674537266240L;
	private List<Job> jobList;

	public List<Job> getJobList() {
		return jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}
}
