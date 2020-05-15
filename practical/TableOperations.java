import java.sql.*;

public class TableOperations 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","ashwini");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from student");
			System.out.println("The records in student table are....");

			System.out.println("Student  Roll no     Name     Marks   ");
			while(rs.next())
			{
				System.out.print("student");
				System.out.print("\t"+rs.getInt("rollno"));
				System.out.print("\t"+rs.getString("stdname"));
				System.out.println("\t"+rs.getInt("stdmarks"));
			}

			stmt.executeUpdate("INSERT INTO student VALUES(110,'tanu',90)");
			System.out.println("table is updated....");

			System.out.println("The table records after updation are....");
			rs = stmt.executeQuery("SELECT * from student");
			System.out.println("Student  Roll no     Name     Marks   ");
			while(rs.next())
			{
				System.out.print("student");
				System.out.print("\t"+rs.getInt("rollno"));
				System.out.print("\t"+rs.getString("stdname"));
				System.out.println("\t"+rs.getInt("stdmarks"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}