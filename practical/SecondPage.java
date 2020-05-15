import java.net.*;
import java.io.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class SecondPage extends JFrame 
{
	public SecondPage(String str)
	{
		super("Successful Login");
		setVisible(true);
		setSize(400,400);
		Font f = new Font("Cooper",Font.BOLD,24);
		setFont(f);
		
		Label l = new Label("We welcome you "+str+" to our website....\n Have a happy surfing experience");
		add(l);
	}
}