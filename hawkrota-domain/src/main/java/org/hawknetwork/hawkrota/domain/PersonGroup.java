package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class PersonGroup extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = -8302288355062584017L;
	private Job job;
	private List<Person> personList;
	private String name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
