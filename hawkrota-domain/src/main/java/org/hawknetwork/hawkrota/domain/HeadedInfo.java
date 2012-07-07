package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

import org.hawknetwork.hawkrota.domain.base.BaseDomainClass;

public class HeadedInfo extends BaseDomainClass implements Serializable {
	private static final long serialVersionUID = 5553700605036760464L;
	private String header;
	private String info;
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
