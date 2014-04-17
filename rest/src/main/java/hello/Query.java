package hello;

import java.sql.*;


public class Query {

		

		public static String Query(String pethaku) {
        
        String name ="voijumalauta";    
      	String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pet WHERE owner = ?");
			stmt.setString(1, pethaku);
			ResultSet res = stmt.executeQuery();

			while (res.next()) 
			{
		  	name = res.getString("name");
		  	/*
		  	System.out.println(pethaku);
		  	System.out.println(name);
		  	*/
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