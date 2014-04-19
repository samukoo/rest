package rest;

import java.sql.*;


public class Query {

		

		public static String Query(String liike) {
        
        String name ="voijumalauta";    
      	String url = "jdbc:mysql://localhost:3306/";
		String dbName = "gymlog";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_workout WHERE liike = ?");
			stmt.setString(1, liike);
			ResultSet res = stmt.executeQuery();

			while (res.next()) 
			{
		  	name = res.getString("kilot");
		  	}
		conn.close();
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
	return name;
	
    }
}