import java.sql.*;
import javax.sql.*;

class CreateTableEx
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
		Statement stmt=con.createStatement();
		stmt.executeQuery("create table student(rollno number, stdname varchar2(10), stdmarks number(10,2))");
		System.out.println("Table created successfully");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}