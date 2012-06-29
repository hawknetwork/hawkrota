package org.hawknetwork.hawkrota.interfacelayer.session;

public interface Session {
	public UserSession getDefaultSession();
	public UserSession getUserSession(String username);
}
