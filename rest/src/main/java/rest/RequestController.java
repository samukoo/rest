package rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController 
	{
    
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/luku")
    public @ResponseBody Greeting greeting(@RequestParam(value="luku", required=false, defaultValue="0")int luku) 
   	{
   		return new Greeting(counter.incrementAndGet(),luku);
    }

	@RequestMapping("/name")
    public @ResponseBody Name name(@RequestParam(value="name", required=false, defaultValue="2")String name) 
   	{
   		return new Name(counter.incrementAndGet(),name);
    }

	@RequestMapping("/search_date")
    public @ResponseBody Date date(@RequestParam(value="date", required=false, defaultValue="date")String date) 
   	{
   		return new Date(counter.incrementAndGet(),date);
    }


}