package rest;


//uuden toistosarjan tallentamiseen tarvitaan liike. Liikkeet on tallennettu kantaan ja ne haetaan
//rest rajapinnan avulla valintalistaan. Tämä on Exercises luokan setteri ja getteri luokka, jonka 
//avulla tietokannan resultset saadaan tallennettua array muuttujaan joka palautetaan request controllerille.

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
