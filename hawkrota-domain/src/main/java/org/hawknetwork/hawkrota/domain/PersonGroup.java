package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

public class PersonGroup implements Serializable {
	private static final long serialVersionUID = -8302288355062584017L;
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
