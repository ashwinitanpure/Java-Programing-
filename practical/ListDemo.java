import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*  <applet code="ListDemo.class" height=300 width=300 >
     </applet>
*/

public class ListDemo extends Applet implements ActionListener
{
	String msg=" ";
	List subject;

	public void init()
	{
		subject= new List(4,true);

		//add items to the list
		subject.add("Java Programing 2");
		subject.add("Java Server Pages");
		subject.add("Android");
		subject.add("Computer Security");
		subject.add("Software Testing");

		//add controls to the applet window
		add(subject);

		//Register events
		subject.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		int idx[];
		msg="Curent subject";
		idx= subject.getSelectedIndexes();

		for(int i=0; i<idx.length; i++)
		{
			msg= subject.getItem(idx[i])+" ";
			g.drawString(msg,100,100+(i*10));
		}//end of for loop
	}//end of paint()
}//end of List class