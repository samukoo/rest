package rest;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class DataBaseQuery {

	
	
	public ArrayList select(String user){
		
		//
		
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "gymlog";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		
		ArrayList result = new ArrayList();
		AtomicInteger id = new AtomicInteger();
		
		
		try 
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
	
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gymlog_exercise where user = ?");
			stmt.setString(1, user);
			ResultSet res = stmt.executeQuery();
		
			while(res.next())
				{
				ExerciseObjects e = new ExerciseObjects();
					e.setLiike(res.getString("liike"));
					e.setId(id.incrementAndGet());
				result.add(e);						
				}
			
			System.out.println(result);
			
		conn.close();
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
				
		//
		
		return result;
	}
	
	
}
