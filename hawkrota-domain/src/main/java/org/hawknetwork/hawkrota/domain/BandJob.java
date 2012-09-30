package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;



public class BandJob implements Serializable {
	private static final long serialVersionUID = 9092260568248036255L;
	private String jobName;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
