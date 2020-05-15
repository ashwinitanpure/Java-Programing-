import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ChoiceDemo.class" height=300 width=300>
    </applet>
*/

public class ChoiceDemo extends Applet implements ItemListener
{
	String msg=" ";
	Choice cSub;

	public void init()
	{
		cSub = new Choice();
		
		//add items to the choice
		cSub.add("Java Programing 2");
		cSub.add("Java Server Pages");
		cSub.add("Android");
		cSub.add("Computer Security");
		cSub.add("Software Testing");
		
		//add controls to the applet window
		add(cSub);

		//Register events
		cSub.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		msg="Selected item: "+cSub.getSelectedItem();
		g.drawString(msg, 100,100);
	}//end of paint() method
}//end of Choice class
	
	