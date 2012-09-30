package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;



public class BandSlotAssignment implements Serializable {
	private static final long serialVersionUID = 3661367008920464597L;
	private BandSlot slot;
	private Person person;
	public BandSlot getSlot() {
		return slot;
	}
	public void setSlot(BandSlot slot) {
		this.slot = slot;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
