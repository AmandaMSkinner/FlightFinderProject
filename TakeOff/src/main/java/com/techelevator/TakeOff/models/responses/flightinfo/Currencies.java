package com.techelevator.TakeOff.models.responses.flightinfo;

public class Currencies{
	private String eUR;

	public void setEUR(String eUR){
		this.eUR = eUR;
	}

	public String getEUR(){
		return eUR;
	}

	@Override
 	public String toString(){
		return 
			"Currencies{" + 
			"eUR = '" + eUR + '\'' + 
			"}";
		}
}
