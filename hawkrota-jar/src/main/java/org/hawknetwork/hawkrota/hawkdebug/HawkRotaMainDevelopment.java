package org.hawknetwork.hawkrota.hawkdebug;

import org.hawknetwork.hawkrota.main.HawkRotaMain;

/**
 * This class is intended for development only, and so doesn't have a test. In Eclipse, one
 * cannot run a main class from a referenced project. Therefore, to launch our application from
 * Eclipse, we have to launch it from this development-only stub launcher. In production, we
 * should run the class from HawkRotaMain directly instead.
 * 
 * @author Adam Burley
 * @since 1.0
 * @see HawkRotaMain
 */
public class HawkRotaMainDevelopment {

	/**
	 * Runs the main method (pass-through to real HawkRotaMain).
	 * 
	 * @param args The command-line arguments passed
	 */
	public static void main(String[] args) {
		HawkRotaMain.main(args);
	}

}
