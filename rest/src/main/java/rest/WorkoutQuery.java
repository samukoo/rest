//Metodi joka tallentaa/lukee Stringin muuttujaan/muuttujasta
//Käytetään QueryWorkout metodissa

package rest;

public class WorkoutQuery {

	private String workout;
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setWorkout(String workout){
		this.workout = workout;
	}
	public String getWorkout(){
		return this.workout;
	}
	
	
	
}
