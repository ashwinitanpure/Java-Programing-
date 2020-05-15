import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="TextAreaDemo.class" height=500 width=500 >
     </applet>
*/

public class TextAreaDemo extends Applet 
{
 	String msg="I am ashwini tanpure from Government Polytechnic Pune." +
		    "I am learning third year diploma in Computer Engineering.";
	TextArea paragraph;

	public void init()
	{
		paragraph= new TextArea(msg, 5,10);

		//add controls to the applet window
		add(paragraph);

	}

	public void paint(Graphics g)
	{
		g.drawString(paragraph.getText(),100,200);
	}
}