package rest;


import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class RequestController 
	{
    
	public ArrayList<String> date = new ArrayList<String>();
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }
/*
	@RequestMapping("/name")
    public @ResponseBody Name name(@RequestParam(value="name", required=false, defaultValue="2")String name) 
   	{
   		return new Name(counter.incrementAndGet(),name);
    }
*/
	@RequestMapping("/search_date")
	
    public @ResponseBody Search_Date name2(@RequestParam(value="date", required=false, defaultValue="")String name2){
        
	
		return new Search_Date(counter.incrementAndGet(), name2);
		
		
    }
   	
   		
    
   	


}