import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="CheckboxDemo.class" height=300 width=300>
   </applet> */
   
public class CheckboxDemo extends Applet implements ItemListener
{
   String msg=" ";
   Checkbox cbJP2, cbJSP, cbCS, cbST, cbAnd;
   
   public void init()
   {
      cbJP2= new Checkbox("Java Programing 2");
	  cbJSP= new Checkbox("Java Server Pages");
	  cbCS= new Checkbox("Computer Security",true);
	  cbST= new Checkbox("Software Testing",true);
	  cbAnd= new Checkbox("Android");
	  
	  //add controls to applet window
	  add(cbJP2);
	  add(cbJSP);
	  add(cbCS);
	  add(cbST);
	  add(cbAnd);
	  
	  //register events
	  cbJP2.addItemListener(this);
	  cbJSP.addItemListener(this);
	  cbAnd.addItemListener(this);
	  cbCS.addItemListener(this);
	  cbST.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent ie)
   {
     repaint(); 
   }
   
   public void paint(Graphics g)
   {
      msg="current state...";
	  g.drawString(msg,100,100);
	  msg="Java Programing 2 : "+cbJP2.getState();
	  g.drawString(msg,100,110);
	  
   }
}