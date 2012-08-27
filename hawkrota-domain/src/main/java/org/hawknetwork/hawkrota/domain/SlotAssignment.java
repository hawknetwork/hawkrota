package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class SlotAssignment extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = 9173884564619159404L;
	private Slot slot;
	private Person person;
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
