package rest;

import java.util.ArrayList;

public class Exercises {
	
	//private int id;
	private ArrayList results;
	
	
	public Exercises(){	
	
		DataBaseQuery db_e = new DataBaseQuery();
		this.results = db_e.select();
		}

	//getterit

	public ArrayList getResult(){
		return this.results;
	}
	
	
	
	
	
}