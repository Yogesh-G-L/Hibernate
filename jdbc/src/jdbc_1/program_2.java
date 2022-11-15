package jdbc_1;
import java.sql.*;
import java.util.Properties;


public class program_2 {

	public static void main(String[] args) {
		
		
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con =

	//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Yo16063#");

		
	
		try {
			String url= "jdbc:mysql://localhost:3306/sakila";
			Properties p= new Properties();
			p.put("sakila", "root");
			p.put("", "admin ");
			Connection con;
			con = DriverManager.getConnection(url, p);
			Statement st = con.createStatement();
			
			String query1= "create table student( studentId int primary key, studentName varchar(20), studentMarks int)"; 

			int i = st.executeUpdate(query1);
			int j = st.executeUpdate("create table student1(studentId int primary key, studentName varchar(20), studentMarks int&quot;)");

			System.out.println("No of rows affected: " +i);//0
			System.out.println("No of rows affected: " +j);//0
			System.out.println("Table created Sucessfully");
			st.close();//comminication
			con.close();//connection*/
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
