package org.hawknetwork.hawkrota.domain;

import java.util.Map;

public class Person {
	private String firstName;
	private String lastName;
	private boolean nameOrder;
	private Map<Job,TrainingStatus> jobStatus;
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
	public Map<Job, TrainingStatus> getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(Map<Job, TrainingStatus> jobStatus) {
		this.jobStatus = jobStatus;
	}
	public boolean isAccredited() {
		return accredited;
	}
	public void setAccredited(boolean accredited) {
		this.accredited = accredited;
	}
}
