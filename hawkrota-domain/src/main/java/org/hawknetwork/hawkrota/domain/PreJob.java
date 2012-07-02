package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;
import java.util.Date;

public class PreJob implements Serializable {
	private static final long serialVersionUID = 2326628629050045316L;
	private String uniqueKey;
	private String headingName;
	private String teamLeader;
	private int numRequired;
	private Date arrivalTime;
	public String getUniqueKey() {
		return uniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}
	public String getHeadingName() {
		return headingName;
	}
	public void setHeadingName(String headingName) {
		this.headingName = headingName;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public int getNumRequired() {
		return numRequired;
	}
	public void setNumRequired(int numRequired) {
		this.numRequired = numRequired;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
}
