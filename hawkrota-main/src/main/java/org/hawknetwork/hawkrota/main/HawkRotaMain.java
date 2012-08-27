package org.hawknetwork.hawkrota.main;

import org.hawknetwork.common.bootstrap.interfaces.BootstrapLoader;
import org.hawknetwork.common.session.interfaces.Session;
import org.hawknetwork.common.session.interfaces.UserSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HawkRotaMain {

	/**
	 * @param args The arguments passed on the command line
	 */
	public static void main(String[] args) {
		ApplicationContext firstContext = new ClassPathXmlApplicationContext("classpath*:/root-bootstrap/bootstrap.xml");

		if ((args != null) && (args.length != 0)) {
			// TODO Support multiple users
			UserSession session = firstContext.getBean("session", Session.class).getDefaultSession();
			session.setCommandLineParameters(args);
		}
		
		BootstrapLoader secondBootstrapLoader = firstContext.getBean("secondBootstrapLoader", BootstrapLoader.class);
		secondBootstrapLoader.loadBootstrap();
	}

}
