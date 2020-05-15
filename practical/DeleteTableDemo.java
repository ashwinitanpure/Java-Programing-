import java.sql.*;

public class DeleteTableDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
			Statement stmt = con.createStatement();
			int i= stmt.executeUpdate("DELETE  from student where rollno=101");
			System.out.println("records deleted from the table..."+i);
			ResultSet rs = stmt.executeQuery("SELECT *from student");
			System.out.println("records after deletion..");
			System.out.println("Student \t Roll no \t   Name \t Marks   ");
			int j=1;
			while(rs.next())
			{
				System.out.print(j);
				System.out.print("\t\t"+rs.getInt("rollno"));
				System.out.print("\t\t"+rs.getString("stdname"));
				System.out.println("\t\t"+rs.getInt("stdmarks"));
				j++;
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