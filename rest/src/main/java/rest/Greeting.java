
package rest;

public class Greeting {

    private final long id;
    private final long luku;
    
    public Greeting(long id, long luku) {
        this.id = id;
        System.out.print(luku);
        System.out.print(id);
        this.luku = luku*2;
        }

    public long getId() {
        return id;
    }
    public long getLuku() {
        return luku;
    }
    
        
}