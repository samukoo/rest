package rest;

import java.util.ArrayList;


public class Workouts{

	private ArrayList result;	
		
	public Workouts(String user){
				
		QueryWorkout qw = new QueryWorkout();	//luodaan qw Olio
			this.result = qw.QueryWorkout(user);	//tallennetaan resultiksi Olion return
	}
		
		public ArrayList getResult(){
		return this.result;
	}
	
}
