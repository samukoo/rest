package rest;

import java.sql.*;
import java.util.ArrayList;

public class QueryWorkout {
	
	String name ="voijumalauta";
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "gymlog";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "root";
	
    	//metodi palauttaa ArrayList:n
		public ArrayList QueryWorkout(String search){ 
		ArrayList workouts = new ArrayList();	//luodaan ArrayList Olio "workouts" mihin tallennetaan tulokset
		
		try
		{
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);	
			PreparedStatement prst = conn.prepareStatement("SELECT date from gymlog_workout");
			ResultSet res = prst.executeQuery(); //resultsettiin queryn tulos
		
		while(res.next())	//tehdään kunnes resultsetti palauttaa falsen (eli data loppuu)
			{
			WorkoutQuery WQ = new WorkoutQuery();	//luodaan WQ constructori
			WQ.setWorkout(res.getString("date"));	//tallennetaan jokain "date" tulos setterillä
			
			workouts.add(WQ);						//WQ metodi palauttaa kaikki tulokset workouts taulukkoon
			}
		
		}
		catch (Exception e)		//napataan virhe ilmoitus mikäli kantayhteys ei toimi
		{
		e.printStackTrace();
		}
		return workouts;
		}
}
