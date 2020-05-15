import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="TextFieldDemo.class" height=300 width=500 >
    </applet>
*/

public class TextFieldDemo extends Applet implements ActionListener
{
	String msg=" ";
	TextField tName, tPassword;
	Label lName, lPassword;
	Button submit;

	public void init()
	{
      		lName= new Label("Name");
		tName= new TextField(20);
		lPassword= new Label("Password");
		tPassword= new TextField(20);
		submit= new Button("submit");
		tPassword.setEchoChar('*');

		//add controls to the applet window
		add(lName);
		add(tName);
		add(lPassword);
		add(tPassword);
		add(submit);

		//Register event
		tName.addActionListener(this);
		tPassword.addActionListener(this);
		submit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Name: "+tName.getText(),100,100);
		g.drawString("Selected text is: "+tName.getSelectedText(),100,150);
		g.drawString("Password: "+tPassword.getText(),100,200);
	}//end of paint()
	
}//end of TextFieldDemo class