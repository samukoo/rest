package rest;

import java.sql.*;
import java.util.*;


public class Query {

		public String Query(String liike) {
        
		ArrayList result = new ArrayList();	
        
		String name="joo";    
      	String url = "jdbc:mysql://localhost:3306/";
		String dbName = "gymlog";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
			
		
			//PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_workout WHERE liike = ?");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_workout WHERE date = ?");
			stmt.setString(1, liike);
			ResultSet res = stmt.executeQuery();

			System.out.println(res);
			
			while (res.next()) 
			{
		  	name = res.getString("liike");
		  	}
		
			//System.out.println(name);
			
		conn.close();
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
	return name;
	
    }
}