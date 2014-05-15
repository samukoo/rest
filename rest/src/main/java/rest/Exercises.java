package rest;

import java.util.ArrayList;

public class Exercises {
	
	//private int id;
	private ArrayList results;
	
	
	public Exercises(String user){	
	
		DataBaseQuery db_e = new DataBaseQuery();
		this.results = db_e.select(user);
		}

	//getterit

	public ArrayList getResult(){
		return this.results;
	}
	
	
	
	
	
}