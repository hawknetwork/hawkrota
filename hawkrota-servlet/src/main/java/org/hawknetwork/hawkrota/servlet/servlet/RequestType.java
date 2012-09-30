package org.hawknetwork.hawkrota.servlet.servlet;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum RequestType {
	PROCESS_AND_WAIT(0),
	PROCESS_AND_NEED_ACKNOWLEDGEMENT(1),
	STATUS_UPDATE(2),
	INPUT_DATA(3);
	
	// Template code
	private final int val;
	private static Map<Integer,RequestType> map;
	private RequestType(int v) { val = v; }
	public int getVal() { return val; }
    static {
        map = new HashMap<Integer, RequestType>();
        for (RequestType month : EnumSet.allOf(RequestType.class)) {
            map.put(month.getVal(), month);
        }
    }
    public static RequestType fromVal(int v) { return map.get(v); }
    public static RequestType fromVal(String s) {
    	int v = 0;
    	try {
    		v = Integer.parseInt(s);
    	} catch (NumberFormatException e) {
    		return null;
    	}
    	return fromVal(v);
    }

}
