import java.sql.*;
import javax.sql.*;

public class CreateTable1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
		String sql_query="create table student(rollno number,stdname varchar2(10),stdmarks number(10,2),stdadr varchar2(20))";
		//Connection con = DriverManager.getConnection(url, "system", "ashwini");
		Statement stmt=con.createStatement();
		stmt.executeQuery("create table student(rollno number, stdname varchar2(10), stdmarks number(10,2))");
		System.out.println("Table created successfully");
		con.close();
	}
}