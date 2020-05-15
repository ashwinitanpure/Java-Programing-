import java.sql.*;

public class SelectTableDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
			System.out.println("database connected successfully...");
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT * from student");

			System.out.println("records are..");
			while(rs.next())
			{
				System.out.println("rollno: "+rs.getInt("rollno"));
				System.out.println("Name: "+rs.getString("stdname"));
				System.out.println("Marks: "+rs.getInt("stdmarks"));
			}
			con.close();
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
		}
		finally
		{
			
		}
	}
}