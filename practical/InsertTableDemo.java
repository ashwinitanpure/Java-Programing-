import java.sql.*;
import java.util.*;

public class InsertTableDemo
{
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
			System.out.println("database connected successfully...");
			System.out.println("Inserting records into the table...");
			
			System.out.println("Enter information of student like roll no,name and marks");
			Scanner sc= new Scanner(System.in);
			System.out.println("Roll no:");
			int no = sc.nextInt();
			System.out.println("Name: ");
			String name= sc.next();
			System.out.println("Marks:");
			int marks= sc.nextInt();
		
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			pstmt.setInt(1,no);
			pstmt.setString(2,name);
			pstmt.setInt(3,marks);
			int i=pstmt.executeUpdate( );
			System.out.println("records inserted into the table.....");
			System.out.println("no of rows inserted"+i);

			PreparedStatement ps =con.prepareStatement("SELECT * from student");
			ResultSet rs=ps.executeQuery();
			System.out.println("records are..");
			System.out.println("Roll no     Name     Marks   ");
			while(rs.next())
			{
				System.out.print("student");
				System.out.print("\t"+rs.getInt("rollno"));
				System.out.print("\t"+rs.getString("stdname"));
				System.out.println("\t"+rs.getInt("stdmarks"));
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