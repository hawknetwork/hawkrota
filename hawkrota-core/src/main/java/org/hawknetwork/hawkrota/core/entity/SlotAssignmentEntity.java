package org.hawknetwork.hawkrota.core.entity;

import org.hawknetwork.hawkrota.domain.Person;
import org.hawknetwork.hawkrota.domain.Slot;

public class SlotAssignmentEntity {
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
