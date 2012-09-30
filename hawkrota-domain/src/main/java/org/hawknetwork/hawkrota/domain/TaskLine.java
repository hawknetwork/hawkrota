package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;



public class TaskLine implements Serializable {
	private static final long serialVersionUID = 3790381648852634269L;
	private String taskLine;
	private boolean important;
	public String getTaskLine() {
		return taskLine;
	}
	public void setTaskLine(String taskLine) {
		this.taskLine = taskLine;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
}
