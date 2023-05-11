package com.techelevator.Takeoff.models.responses.flightinfo;

public class Departure{
	private String iataCode;
	private String at;
	private String terminal;

	public void setIataCode(String iataCode){
		this.iataCode = iataCode;
	}

	public String getIataCode(){
		return iataCode;
	}

	public void setAt(String at){
		this.at = at;
	}

	public String getAt(){
		return at;
	}

	public void setTerminal(String terminal){
		this.terminal = terminal;
	}

	public String getTerminal(){
		return terminal;
	}

	@Override
 	public String toString(){
		return 
			"Departure{" + 
			"iataCode = '" + iataCode + '\'' + 
			",at = '" + at + '\'' + 
			",terminal = '" + terminal + '\'' + 
			"}";
		}
}
