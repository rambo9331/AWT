package test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
	// setSize(300,900);
	public static void main(String[] Args) {
		Frame f = new Frame("Calculator");
		Button b1 = new Button("0");
		Button b2 = new Button("1");
		Button b3 = new Button("2");
		Button b4 = new Button("3");
		Button b5 = new Button("4");
		Button b6 = new Button("5");
		Button b7 = new Button("6");
		Button b8 = new Button("7");
		Button b9 = new Button("8");
		Button b10 = new Button("9");
		Button b11 = new Button("+");
		Button b12 = new Button("-");
		Button b13 = new Button("*");
		Button b14 = new Button("%");
		Button b15 = new Button("=");
		Button b16 = new Button("CLS");

		b1.setBounds(50, 100, 30, 30);
		b2.setBounds(80, 100, 30, 30);
		b3.setBounds(110, 100, 30, 30);
		b4.setBounds(140, 100, 30, 30);
		b5.setBounds(50, 130, 30, 30);
		b6.setBounds(80, 130, 30, 30);
		b7.setBounds(110, 130, 30, 30);
		b8.setBounds(140, 130, 30, 30);
		b9.setBounds(50, 160, 30, 30);
		b10.setBounds(80, 160, 30, 30);
		b11.setBounds(110, 160, 30, 30);
		b12.setBounds(140, 160, 30, 30);
		b13.setBounds(50, 190, 30, 30);
		b14.setBounds(80, 190, 30, 30);
		b15.setBounds(110, 190, 30, 30);
		b16.setBounds(140, 190, 30, 30);
		
		TextField tf = new TextField();
		tf.setBounds(50, 40, 120,30 );
		f.add(tf);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);

		f.setSize(300, 450);
		f.setLayout(null);
		f.setVisible(true);

	}

}
