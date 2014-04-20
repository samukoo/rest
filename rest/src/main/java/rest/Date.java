
package rest;

public class Date {
	
	private final long id;
    private final String date;
		
	public Date(long id, String date){
		this.id = id;
        
        Query db = new Query();
        this.date = db.Query(date);
                
        //this.name = Query.Query(name);
        System.out.print(date);
               
		}

    
	
	
	public long getId() {
        return id;
    }
    
     public String getName() {
        return date;
    }	
	
}


