package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;



public class PersonGroupList implements Serializable {
	private static final long serialVersionUID = -7913369253674931618L;
	private List<PersonGroup> personGroupList;

	public List<PersonGroup> getPersonGroupList() {
		return personGroupList;
	}

	public void setPersonGroupList(List<PersonGroup> personGroupList) {
		this.personGroupList = personGroupList;
	}
}
