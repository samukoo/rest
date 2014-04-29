package rest;

public class ExerciseObjects {

	private String liike;
	private int id;
	
	//setit
	public void setLiike(String liike){
		this.liike = liike;
	}
	
	public void setId(int id){
		this.id = id;
	}
		
	//getit
	public String getLiike(){
		return this.liike;
	}
	public int getId(){
		return this.id;
	}
}
