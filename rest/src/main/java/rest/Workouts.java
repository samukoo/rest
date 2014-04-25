package rest;

import java.util.ArrayList;


public class Workouts{

	private ArrayList result;	
	private long id;
	
	
	public Workouts(long id, String search){
		
		this.id = id;	//counter id
		QueryWorkout qw = new QueryWorkout();	//luodaan qw Olio
			this.result = qw.QueryWorkout(search);	//tallennetaan resultiksi Olion return
	}
		
	//getterit, Workouts ei palauta mitään, getterit palauttaa arvot
	public ArrayList getResult(){
		return this.result;
	}
	public long getId(){
		return this.id;
	}
}
