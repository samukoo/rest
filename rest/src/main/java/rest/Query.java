package rest;

import java.sql.*;
import java.util.*;


public class Query {

		public String Query(String liike) {
        
		ArrayList<String> result = new ArrayList<String>();	
        
		String name="ei tuloksia";    
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

			//luodaan db tuloksille instansoitu taulukkomuuttuja "result"
			
								
			//tehdään niin pitkään kun res.next ei palauta falsea, eli kun on tuloksia
			//eli result taulukkoon lisätään tuloksien "liike"
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
	
		//return result;	
		return name;
		
    }
}