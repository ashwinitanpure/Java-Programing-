import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
//cd F:\JP2\practice
//set classpath=%classpath%;C:\java\jre7\bin;
public class Login extends JFrame implements ActionListener
{
	
	JLabel luser,lpass;
	TextField tuser,tpass;
	JButton login,register;
	String msg="";
	
	public Login() throws Exception
	{
		super("Login");
		setVisible(true);
		setSize(800,800);
		setLayout(new FlowLayout());
	
		luser = new JLabel("Loginname: ");
		lpass = new JLabel("Password: ");
		tuser = new TextField(10);
		tpass = new TextField(10);
		char ch = '*';
		tpass.setEchoChar(ch);
		login = new JButton("LOGIN");
		register = new JButton("REGISTER");
		
		luser.setBounds(20,20,100,30);
		lpass.setBounds(20,60,100,30);
		tuser.setBounds(130,20,100,30);
		tpass.setBounds(130,60,100,30);
		login.setBounds(130,120,150,50);
		register.setBounds(300,120,150,80);
		
		add(luser);
		add(tuser);
		add(lpass);
		add(tpass);
		add(login);
		add(register);
		
		login.addActionListener(this);
		register.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		System.out.println("in action");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from LoginList");
		
		String user = tuser.getText();
		String pass  = tpass.getText();
		int count=0;
		rs.next();
		System.out.println(rs.getString(1));
		
		while(rs.next())
		{
		System.out.println("in while");
			if(rs.getString(1).equals(user) && rs.getString(2).equals(pass))
			{
			  count++;
			  new SecondPage(user);
			  break;
			}
		}
		if(count == 0)
		{
			new MyDialog(this,"message");
		}
		}
		catch(Exception e)
		{}
	}
	
	public static void main(String args[]) throws Exception
	{
		new Login();
	}
}
class MyDialog extends Dialog implements ActionListener
{
	MyDialog(Frame parent, String title)
	{
		super(parent,title);
		setVisible(true);
		setSize(200,200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(parent);
		add(new Label("Wrong login name or password..."));
		Button b = new Button("OK");
		add(b);
		pack();
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}