package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;



public class AssignedJob implements Serializable {
	private static final long serialVersionUID = 6058310878754307489L;
	private Job job;
	private int trainingTimesLeft;
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public int getTrainingTimesLeft() {
		return trainingTimesLeft;
	}
	public void setTrainingTimesLeft(int trainingTimesLeft) {
		this.trainingTimesLeft = trainingTimesLeft;
	}
}
