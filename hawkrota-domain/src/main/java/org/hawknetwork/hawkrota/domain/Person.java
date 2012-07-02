package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
	private static final long serialVersionUID = -5622082806280153735L;
	private String firstName;
	private String lastName;
	private boolean nameOrder;
	private List<AssignedJob> assignedJobList;
	private boolean accredited;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isNameOrder() {
		return nameOrder;
	}
	public void setNameOrder(boolean nameOrder) {
		this.nameOrder = nameOrder;
	}
	public List<AssignedJob> getJobStatus() {
		return assignedJobList;
	}
	public void setJobStatus(List<AssignedJob> assignedJobList) {
		this.assignedJobList = assignedJobList;
	}
	public boolean isAccredited() {
		return accredited;
	}
	public void setAccredited(boolean accredited) {
		this.accredited = accredited;
	}
}
