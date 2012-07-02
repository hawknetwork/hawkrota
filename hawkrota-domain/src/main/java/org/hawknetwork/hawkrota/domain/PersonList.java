package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

public class PersonList implements Serializable {
	private static final long serialVersionUID = -3200425421469939728L;
	private List<Person> personList;

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
