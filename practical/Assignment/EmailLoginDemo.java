import java.io.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="EmailLoginDemo.class" height="500" width="500">
</applet> */

public class EmailLoginDemo extends JApplet implements ActionListener
{
	JLabel jlName,jlPassword,jlPhone,jlGender, jlDOB;
	JTextField jtName,jtPassword,jtPhone,jtDOB;
	JRadioButton jrbMale ,jrbFemale;
	JButton jbSub;
	
	public void init()
	{

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		jlName = new JLabel("Name: ");
		jlPassword = new JLabel("Password: ");
		jlPhone = new JLabel("Phone");
		jlGender = new JLabel("Gender: ");
		jlDOB = new JLabel("Date of Birth:");

		jtName = new JTextField(20);
		jtPassword = new JTextField(20);
		jtPhone = new JTextField(20);
		jtDOB = new JTextField(20);

		jrbMale = new JRadioButton("Male");
		jrbFemale = new JRadioButton("Female");
		ButtonGroup bgGender = new ButtonGroup();
		bgGender.add(jrbMale);
		bgGender.add(jrbFemale); 

		jbSub = new JButton("Submit");

		//add component to panel
		cp.add(jlName);
		cp.add(jtName);
		cp.add(jlPassword);
		cp.add(jtPassword);
		cp.add(jlPhone);
		cp.add(jtPhone);
		cp.add(jlGender);
		cp.add(jrbMale);
		cp.add(jrbFemale);
		cp.add(jlDOB);
		cp.add(jtDOB);
		
		cp.add(jbSub);

		//register listener on button
		jbSub.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:thin:@localhost:1251:XE","system","ashwini");
		//Statement stmt= con.createStatement();
		//stmt.executeQuery("create table CLIENT(name VARCHAR,password VARCHAR, phone VARCHAR, DOB date )");

		PreparedStatement ps = con.prepareStatement("insert into CLIENT values(?,?,?,?)");
		ps.setString(1,jtName.getText());
		ps.setString(2,jtPassword.getText());
		ps.setString(3,jtPhone.getText());
		ps.setString(4,jtDOB.getText());

		ps.executeUpdate();
		}
		catch(Exception e)
		{
		
		}
	}

}