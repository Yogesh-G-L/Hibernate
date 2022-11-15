package jdbc_1;
import java.sql.*;


public class demo_prog {

	public static void main(String[] args) throws Exception {
		
		// jdbc connect parametter 
		//jdbc:mysql://localhost:3306/?user=root
		String url="jdbc:mysql://localhost:3306/sakila";
		String name="root";
		String pass="Yo16063#";
		String qurey="select first_name from actor where actor_id=2;";
	
	//	Class.forName("com.mysql.Driver");//2
		try {
			Connection con = DriverManager.getConnection(url,name,pass);
			
			Statement st = con.createStatement();
			
			ResultSet  rs= st.executeQuery(qurey);
			rs.next();
			
			String name1 =rs.getString("first_name");
			System.out.println(name1);
			st.close();
			rs.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
