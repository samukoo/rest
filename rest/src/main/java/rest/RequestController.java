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
    
	//public ArrayList<String> date = new ArrayList<String>();
    private final AtomicLong counter = new AtomicLong();
 
    //haetaan päivämäärällä, palautuu liikkeet, toistot ja painot
	@RequestMapping("/search_date")
	public @ResponseBody Search_Date search_date(@RequestParam(value="date", required=false, defaultValue="")String name2){
        return new Search_Date(counter.incrementAndGet(), name2);
    }
   	
	//workouts palauttaa tietokannasta kaikki päivämäärät
	@RequestMapping("/workouts")
	public @ResponseBody Workouts workouts(){
		return new Workouts();
	}

	//exercises palauttaa kaikki kantaan tallennetut liikkeet valintoja varten
	@RequestMapping("/exercises")
	public @ResponseBody Exercises exercises(){
		return new Exercises(); 
	}
	
}