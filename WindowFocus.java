package test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class WindowFocus {
	
	public static void main() {
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(300, 300);
		f.setBackground(Color.BLACK);
		f.addWindowFocusListener(new MyWindow());
	}
}
	class MyWindow implements WindowFocusListener{

		@Override
		public void windowGainedFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("window focus gained"+e);
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("window focus lost"+e);
		}
		
	}

