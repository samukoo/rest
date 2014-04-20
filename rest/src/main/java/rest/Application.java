package rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    
        Application app1 = new Application(),app2 = new Application();
        app1.testiTulostus("13.03.2014");
        
        
    }

    public void testiTulostus(String liike){
    	    	      
        Query db = new Query();
           
        System.out.println(db.Query(liike));
        
        
        
        
    }
}