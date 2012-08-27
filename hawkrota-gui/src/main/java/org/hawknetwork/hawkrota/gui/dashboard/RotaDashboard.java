package org.hawknetwork.hawkrota.gui.dashboard;

public class RotaDashboard {
	boolean isInitialised = false;
	
	public void initDashboard() {
		
	}
	
	public void showDashboard() {
		if (!isInitialised) {
			initDashboard();
		}
		//TODO
		//* border layout with heading and close button as page start and end
		//* center is a grid layout consisting of icon buttons and text, similar to
		//  that program we used to record podcasts on in church.
	}
}
