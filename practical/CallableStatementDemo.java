import java.sql.*;
import javax.sql.*;

public class CallableStatementDemo
{
	public static void main(String args[]) 
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ashwini");
		CallableStatement csstmt=con.prepareCall("{call totalOfMarks(?,?)}");
		csstmt.registerOutParameter(2,java.sql.Types.INTEGER);
		csstmt.setInt(1,77);
		csstmt.executeQuery( );
		System.out.println("Total = "+csstmt.getInt(2));
		con.close();
		}catch(SQLException e){System.out.println(e);}
		catch(Exception e){System.out.println(e);}
		
	}
}