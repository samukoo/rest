
package rest;

public class Name {

    private final long id;
    private final String name;
    
    public Name(long id, String name) {
        this.id = id;
        this.name = Query.Query(name);
        System.out.print(name);
        }

     public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
        
}