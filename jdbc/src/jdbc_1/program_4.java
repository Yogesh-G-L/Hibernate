package jdbc_1;
import java.sql.*;

public class program_4 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pt = null;
		try {
		//Class.forName(&quot;com.mysql.cj.jdbc.Driver&quot;);
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Yo16063#");

		pt = con.prepareStatement("insert into customer values(customer_id,first_name,addres_id)");
		pt.setInt(1,2);
		pt.setString(3,"Priti");
		pt.setInt(6, 30);
		
		boolean i = pt.execute();
		System.out.println("No of rows affectred:" + i);
		System.out.println("Rows inserted successfully");
		}
		catch(Exception e) {
		System.out.println(e);
		}
		
		finally {
			try {
				if(pt != null) {
					pt.close();
					pt =null;
				}
		 }
		catch(Exception e) {
			System.out.println(e);
			}
			try {
				if(con != null) {
					con.close();
					con =null;
					}
				}
			catch(Exception e) {
				System.out.println(e);
			}

		}

	}

}
