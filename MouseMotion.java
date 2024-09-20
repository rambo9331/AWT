package test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotion {
	
	public static void main() {
		Frame f = new Frame();
		f.setSize(300, 600);
		f.setBackground(Color.CYAN);
		f.setVisible(true);
		f.addMouseMotionListener(new MouseMotionExample());
	}
}
	 class MouseMotionExample  implements MouseMotionListener{
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			 int x = e.getX(); 
		        int y = e.getY(); 
		        
		        System.out.println("mouse moved to" +x+y);
			
		}
		
	}

