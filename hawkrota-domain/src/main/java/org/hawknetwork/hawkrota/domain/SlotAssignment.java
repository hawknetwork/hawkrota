package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

public class SlotAssignment implements Serializable {
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
