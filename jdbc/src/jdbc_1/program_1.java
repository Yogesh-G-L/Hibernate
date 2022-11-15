package jdbc_1;
import java.sql.*;


public class program_1 {

	public static void main(String[] args) throws Exception{
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Yo16063#");
			
			Statement st= con.createStatement();
			// add the exceute able query here.select address,phone  from address where address_id=5;
			String query="select address,phone  from address where address_id=5;";
			ResultSet rs= st.executeQuery(query);
			
			rs.next();
			String name= rs.getString("address");
			String name2= rs.getString("phone");
			System.out.println(name);
			System.out.println(name2);
			
			st.close();
			rs.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
