package rest;

import java.util.*;

public class Search_Date {
	
	private final long id;
	public ArrayList<String> result = new ArrayList<String>();
		
	public Search_Date(long id, String date){
		
		this.id = id;        
		QueryArray db = new QueryArray();
		this.result = db.Query(date);
        System.out.println(result);       
		}

	public long getId() {
        return id;
    }
    
     public ArrayList<String> getResult() {
        return result;
    }	
	
}


