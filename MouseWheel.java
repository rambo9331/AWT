package test;

import java.awt.Frame;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheel {
	public static void main(String[]Args) {
		Frame f = new Frame();
		f.setSize(300, 600);
		f.setVisible(true);
		f.addMouseWheelListener(new MouseWheelexample());
	}
}
	class MouseWheelexample implements MouseWheelListener{

		@Override
		public void  mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			System.out.println("wheel moved"+e.getPreciseWheelRotation());
		}
		
		
		
	}

	
