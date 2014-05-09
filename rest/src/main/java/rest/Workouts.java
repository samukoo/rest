package rest;

import java.util.ArrayList;


public class Workouts{

	private ArrayList result;	
	//private long id;
	
	
	public Workouts(){
		
		//this.id = id;	//counter id
		QueryWorkout qw = new QueryWorkout();	//luodaan qw Olio
			this.result = qw.QueryWorkout();	//tallennetaan resultiksi Olion return
	}
		
	//getterit, Workouts ei palauta mitään, getterit palauttaa arvot
	/*
	public long getId(){
		return this.id;
	}
	*/
	public ArrayList getResult(){
		return this.result;
	}
	
}
