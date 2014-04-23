package rest;

public class MessageObjects {

	private String liike;
	private String toistot;
	private int kilot;
	
	public String getLiike(){
		return liike;
	}
	public String getToistot(){
		return toistot;
	}	
	public int getPainot(){
		return kilot;
	}
	public void setLiike(String liike){
		this.liike = liike;
	}
	public void setToistot(String toistot){
		this.toistot = toistot;
	}
	public void setPainot(int kilot){
		this.kilot = kilot;
	}
	
	

}
