package test;
import java.awt.event.WindowListener;
import java.awt.Frame;
import java.awt.Label;

public class HelloGanesha1 extends Frame{
	public HelloGanesha1()
	{
		super();
		System.out.println("From Constructor");
		setTitle("Hello Ganesha 1");
		setSize(300,300);
		GaneshaWindowListener listenerObj=new GaneshaWindowListener();
		addWindowListener(listenerObj);
		Label lableMeassage = new Label("Happy Vinayaka Chavithi");
		add(lableMeassage);
		setVisible(true);
	}

}
