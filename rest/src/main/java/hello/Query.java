package hello;

import java.sql.*;


public class Query {

       public static void Query() {
        
       
      String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT * from pet");

			while (res.next()) 
			{
		  	String name = res.getString("name");
		  	String owner = res.getString("owner");
		  	System.out.println(name + "\t" + owner);
		  	}

		conn.close();
		} 

		catch (Exception e) 
		{
		e.printStackTrace();
		}


    }
}