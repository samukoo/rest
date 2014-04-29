package rest;

import java.sql.*;
import java.util.*;

//haetaan päivämäärällä. Tuloksena palutetaan Arraylista tietokannasta
//MessageObjectia käytetään tulosten viemiseen ja tuomiseen oikeaan muotoon arraylle joka palautetaan

public class QueryArray {

		public ArrayList<String> Query(String date) {
        
		ArrayList result = new ArrayList();	
        
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "gymlog";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		  
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
	
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_workout WHERE date = ? ORDER by id");
			stmt.setString(1, date);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) 
			{
				MessageObjects messageObject = new MessageObjects();
				messageObject.setLiike(res.getString("liike"));
				messageObject.setToistot(res.getString("toistot"));
				messageObject.setPainot(res.getInt("kilot"));
				
			result.add(messageObject);
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