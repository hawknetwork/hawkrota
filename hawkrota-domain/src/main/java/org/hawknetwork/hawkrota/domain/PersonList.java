package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

import org.hawknetwork.hawkrota.domain.base.BaseDomainClass;

public class PersonList extends BaseDomainClass implements Serializable {
	private static final long serialVersionUID = -3200425421469939728L;
	private List<Person> personList;

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
