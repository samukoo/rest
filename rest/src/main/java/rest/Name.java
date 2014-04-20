
package rest;

public class Name {

    private final long id;
    private final String liike;
    
    public Name(long id, String liike) {
        this.id = id;
        
        Query db = new Query();
        this.liike = db.Query(liike);
                
        //this.name = Query.Query(name);
        System.out.print(liike);
        }

     public long getId() {
        return id;
    }
    public String getName() {
        return liike;
    }
    
        
}