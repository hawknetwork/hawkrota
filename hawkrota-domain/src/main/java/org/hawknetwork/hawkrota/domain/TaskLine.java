package org.hawknetwork.hawkrota.domain;

public class TaskLine {
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
