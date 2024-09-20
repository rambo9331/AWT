package test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI3  implements ActionListener {
	TextField tf,tf1,tf2;
	Button press;
	public UI3() 
	{
		Frame f= new Frame();
		f.setSize(400,300);
		f.setBackground(Color.GREEN);
		f.setVisible(true);
		
		press =new Button("Press");
		press.setSize(100,50);
		press.setLocation(50,50);
		press.addActionListener(this);
		
		Label FirstNameLabel1=new Label("First Name");
		FirstNameLabel1.setBounds(10, 120, 80, 50);
		
		
		Label MiddleNameLabel2=new Label("Middle Name");
		MiddleNameLabel2.setBounds(10, 150, 80, 50);
		
		Label FullNameLabel3=new Label("Full Name");
		FullNameLabel3.setBounds(10, 180, 80, 50);
		
		tf= new TextField();
		tf1=new TextField();
		tf2=new TextField();
		
		tf.setBounds(100, 120, 200, 50);
		tf1.setBounds(100, 170, 200, 50);
		tf2.setBounds(100, 220, 200, 50);
		
		f.add(press);
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.setVisible(true);
		
		
		
		
	}
	public static void main() {
		UI3 ui=new UI3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name= tf.getText();
		String name1= tf1.getText();
		
		tf2.setText(name + name1);
		
		
	}

}
