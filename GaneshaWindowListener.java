package test;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GaneshaWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("inside windowopened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("inside windowClosing");
		e.getWindow().dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("inside windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("inside windowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("inside Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
	
		System.out.println("inside windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("inside window deactivated");
		
	}

}
