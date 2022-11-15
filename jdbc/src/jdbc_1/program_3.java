package jdbc_1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class program_3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Yo16063#");

			Statement st = con.createStatement();
			String query = "select customer_id,first_name, email from customer where customer_id between 33 and 44;";
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmt = rs.getMetaData();
			System.out.println(rsmt);
			
			int cols = rsmt.getColumnCount();
			while(rs.next())
			{
			for(int i= 1; i<=cols;i++) {
				System.out.println(rs.getString(i)+ "\t");
			}
				System.out.println("");
				}
				st.close();
				con.close();
			}
			catch(Exception e){
			System.out.println(e);
			}
			
	}

}
