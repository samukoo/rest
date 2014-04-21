package rest;

import java.sql.*;
import java.util.*;

//haetaan päivämäärällä. Tuloksena palutetaan Arraylista tietokannasta

public class QueryArray {

		public ArrayList<String> Query(String date) {
        
		ArrayList<String> result = new ArrayList<String>();	
        
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "gymlog";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
	
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_workout WHERE date = ?");
			stmt.setString(1, date);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) 
			{
		  	result.add(res.getString("liike"));
		  	}
			
			for(int i=0; i < result.size() ; i++){
			
				System.out.println(result.get(i));
			}
			
		conn.close();
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
	return result;	
    }
}