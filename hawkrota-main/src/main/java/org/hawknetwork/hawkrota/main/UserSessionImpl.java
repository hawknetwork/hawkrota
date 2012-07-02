package org.hawknetwork.hawkrota.main;

import java.util.HashMap;
import java.util.Map;

import org.hawknetwork.hawkrota.interfacelayer.session.UserSession;

public class UserSessionImpl implements UserSession {
	
	private Map<String,String> commandLineParameters;
	private Map<String,Object> attributes;
	
	UserSessionImpl() {
		commandLineParameters = new HashMap<String,String>();
		attributes = new HashMap<String,Object>();
	}

	@Override
	public String getCommandLineParameterValue(String parameterName) {
		return commandLineParameters.get(parameterName);
	}

	@Override
	public void setCommandLineParameters(String[] args) {
		// TODO loop through and detect
	}

	@Override
	public Object getAttribute(String attributeName) {
		return attributes.get(attributeName);
	}

	@Override
	public void setAttribute(String attributeName, Object attributeValue) {
		attributes.put(attributeName, attributeValue);
	}

	@Override
	public boolean containsAttribute(String attributeName) {
		return attributes.containsKey(attributeName);
	}

	@Override
	public boolean containsCommandLineParameter(String attributeName) {
		return commandLineParameters.containsKey(attributeName);
	}
}
