package com.techelevator.TakeOff.models.responses.locations;

public class Address{
	private String countryCode;
	private String stateCode;

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setStateCode(String stateCode){
		this.stateCode = stateCode;
	}

	public String getStateCode(){
		return stateCode;
	}
}
