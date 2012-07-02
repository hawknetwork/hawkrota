package org.hawknetwork.hawkrota.main;

import org.hawknetwork.hawkrota.interfacelayer.bootstrap.AfterBootstrap;
import org.hawknetwork.hawkrota.interfacelayer.bootstrap.Bootstrap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLBootstrapImpl implements Bootstrap {
	
	private String nextBean;
	private String[] configLocations;
	private ApplicationContext secondContext;

	@Override
	public void doBootstrap() {
		secondContext = new ClassPathXmlApplicationContext(configLocations);
	}

	public String getNextBean() {
		return nextBean;
	}

	public void setNextBean(String nextBean) {
		this.nextBean = nextBean;
	}

	public void setConfigLocationCSV(String configLocationCSV) {
		this.configLocations = configLocationCSV.split(",");
	}

	@Override
	public void nextStep() {
		AfterBootstrap nextStep = secondContext.getBean(nextBean, AfterBootstrap.class);
		nextStep.afterBootstrap();
	}
	
}
