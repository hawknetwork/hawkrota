package org.hawknetwork.hawkrota.gui.splash;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.hawknetwork.hawkrota.interfacelayer.bootstrap.Bootstrap;
import org.hawknetwork.hawkrota.interfacelayer.bootstrap.BootstrapLoader;

public class SplashScreenImpl implements BootstrapLoader {
	
	private Bootstrap secondBootstrap;
	
	@Override
	public void loadBootstrap() {
		JFrame splashScreen = new JFrame("HawkRota");
		splashScreen.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		splashScreen.pack();
		splashScreen.setVisible(true);
		secondBootstrap.doBootstrap();

		// Wait a couple of seconds in case the bootstrap was too quick and user would be dizzy
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// Don't need to do anything but continue
		}
		
		splashScreen.setVisible(false);
		splashScreen.dispose();
		secondBootstrap.nextStep();
	}

	public Bootstrap getSecondBootstrap() {
		return secondBootstrap;
	}

	public void setSecondBootstrap(Bootstrap secondBootstrap) {
		this.secondBootstrap = secondBootstrap;
	}
}
