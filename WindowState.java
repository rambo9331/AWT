package test;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.util.EventListener;

 class WindowState  {
	public static void main(String[]Args){
		
		
		Frame f= new Frame();
		f.addWindowStateListener(new MyWindowState());
		f.setSize(400, 600);
		f.setVisible(true);
	}
 }
	 class MyWindowState implements WindowStateListener{
		 
		 @Override
		public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
			 System.out.println("window old state"+ e.getOldState());
			 System.out.println("window new state"+ e.getNewState());
			 
		}
	 
	 }

