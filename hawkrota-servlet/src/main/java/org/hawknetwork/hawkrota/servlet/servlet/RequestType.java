package org.hawknetwork.hawkrota.servlet.servlet;

public enum RequestType {
	PROCESS_AND_NEED_RESPONSE(0),
	PROCESS_AND_NEED_ACKNOWLEDGEMENT(1),
	STATUS_UPDATE(2);
	private final int val;
	private RequestType(int v) { val = v; }
	public int getVal() { return val; }
}
