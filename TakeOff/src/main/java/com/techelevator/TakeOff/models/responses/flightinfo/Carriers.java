package com.techelevator.Takeoff.models.responses.flightinfo;

public class Carriers{
	private String jsonMember2L;
	private String lX;

	public void setJsonMember2L(String jsonMember2L){
		this.jsonMember2L = jsonMember2L;
	}

	public String getJsonMember2L(){
		return jsonMember2L;
	}

	public void setLX(String lX){
		this.lX = lX;
	}

	public String getLX(){
		return lX;
	}

	@Override
 	public String toString(){
		return 
			"Carriers{" + 
			"2L = '" + jsonMember2L + '\'' + 
			",lX = '" + lX + '\'' + 
			"}";
		}
}
