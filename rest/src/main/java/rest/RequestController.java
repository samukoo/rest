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
	public @ResponseBody Search_Date search_date(
			@RequestParam(value="date", required=false, defaultValue="")String date,
			@RequestParam(value="user", required=true, defaultValue="")String user
			){
        return new Search_Date(counter.incrementAndGet(), date, user);
    }
   	
	//workouts palauttaa tietokannasta kaikki päivämäärät tietyllä käyttäjälle
	@RequestMapping("/workouts")
	public @ResponseBody Workouts workouts(@RequestParam(value="user", required=true, defaultValue="")String user){
		return new Workouts(user);
	}

	//exercises palauttaa kaikki kantaan tallennetut liikkeet valintoja varten
	@RequestMapping("/exercises")
	public @ResponseBody Exercises exercises(@RequestParam(value="user",required=true, defaultValue="")String user){
		return new Exercises(user); 
	}
	
}