package rest;

import java.util.*;

public class Search_Date {
	
	private final long id;
	public ArrayList result = new ArrayList();
		
	public Search_Date(long id, String date, String user){
		
		this.id = id;        
		QueryArray db = new QueryArray();
		this.result = db.Query(date, user);
		System.out.println(result);
	
		}

	public long getId() {
        return id;
    }
    
     public ArrayList getResult() {
        return result;
    }	
	
     
     
     
}


