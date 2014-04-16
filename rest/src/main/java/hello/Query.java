package hello;

import java.sql.*;


public class Query {

       public static void Query(String pethaku) {
        
       
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

			/*
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT name from pet where owner = 'Diane'");
			*/

			while (res.next()) 
			{
		  	String name = res.getString("name");
		  	//String owner = res.getString("owner");
		  	//System.out.println(name + "\t" + owner);
		  	System.out.println(pethaku);
		  	System.out.println(name);
		  	}

		conn.close();
		} 

		catch (Exception e) 
		{
		e.printStackTrace();
		}


    }
}