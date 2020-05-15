import java.sql.*;
import javax.sql.*;

public class CallableStatementDemo1
{
	public static void main(String args[]) 
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
		CallableStatement csstmt=con.prepareCall("{call totalOfMarks(?,?)}");
		csstmt.registerOutParameter(2,java.sql.Types.INTEGER);
		
		PreparedStatement ps =con.prepareStatement("SELECT * from student");
			ResultSet rs=ps.executeQuery();
			System.out.println("records are..");
			System.out.println("Student\tRoll no\tName\tMarks   ");
			while(rs.next())
			{
				System.out.print(j);
				System.out.print("\t"+rs.getInt("rollno"));
				System.out.print("\t"+rs.getString("stdname"));
				System.out.println("\t"+rs.getInt("stdmarks"));

				csstmt.setInt(1,rs.getInt("stdmarks"));
				csstmt.executeQuery( );
				System.out.println("Total = "+csstmt.getInt(2));

				j++;
			}
		
		con.close();
		}catch(SQLException e){System.out.println(e);}
		catch(Exception e){System.out.println(e);}
		
	}
}