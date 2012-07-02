package org.hawknetwork.hawkrota.main;

import org.hawknetwork.hawkrota.interfacelayer.session.Session;
import org.hawknetwork.hawkrota.interfacelayer.session.UserSession;

public class SessionImpl implements Session {
	
	private static UserSession defaultSession;
	
	static {
		defaultSession = new UserSessionImpl();
	}

	@Override
	public UserSession getDefaultSession() {
		return defaultSession;
	}

	@Override
	public UserSession getUserSession(String username) {
		// TODO Support multiple users
		return getDefaultSession();
	}

}
