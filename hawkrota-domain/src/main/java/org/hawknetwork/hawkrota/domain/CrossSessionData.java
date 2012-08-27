package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

import org.hawknetwork.common.base.impl.BaseFileIntendedDomainClass;

public class CrossSessionData extends BaseFileIntendedDomainClass implements Serializable {
	private static final long serialVersionUID = -1580754970612033329L;
	private JobList jobList;
	private Organisation organisation;
	private PersonGroupList personGroupList;
	private PersonList personList;
	public JobList getJobList() {
		return jobList;
	}
	public void setJobList(JobList jobList) {
		this.jobList = jobList;
	}
	public Organisation getOrganisation() {
		return organisation;
	}
	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	public PersonGroupList getPersonGroupList() {
		return personGroupList;
	}
	public void setPersonGroupList(PersonGroupList personGroupList) {
		this.personGroupList = personGroupList;
	}
	public PersonList getPersonList() {
		return personList;
	}
	public void setPersonList(PersonList personList) {
		this.personList = personList;
	}
}
