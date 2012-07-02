package org.hawknetwork.hawkrota.domain;

import java.util.List;

public class PersonGroup {
	private Job job;
	private List<Person> personList;
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
