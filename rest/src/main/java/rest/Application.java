package rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    
    Query testi = new Query();
    System.out.println( testi.Query("kyykky"));
        
    /*    
    Search_Date db2 = new Search_Date();
    
    db2.SearchDate(0, "13.03.2014");
    System.out.println(db2.getResult());
    */
    
    
    
    }
    }