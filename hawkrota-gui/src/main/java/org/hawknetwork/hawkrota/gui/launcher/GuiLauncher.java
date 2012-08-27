package org.hawknetwork.hawkrota.gui.launcher;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.hawknetwork.common.bootstrap.interfaces.AfterBootstrap;
import org.hawknetwork.hawkrota.gui.dashboard.RotaDashboard;

public class GuiLauncher implements AfterBootstrap {
	RotaDashboard dashboard;
	
	@Override
	public void afterBootstrap() {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				dashboard = new RotaDashboard(); //TODO inject via spring
				// TODO dashboard.init and dashboard.show [...]
			}
		});
	}
	
	public void setRotaDashboard(RotaDashboard rotaDashboard) {
		this.dashboard = rotaDashboard;
	}
}
