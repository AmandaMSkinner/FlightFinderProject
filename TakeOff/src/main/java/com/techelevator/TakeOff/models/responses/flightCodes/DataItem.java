package com.techelevator.TakeOff.models.responses.flightCodes;

public class DataItem{
	private String commonName;
	private String iataCode;
	private String icaoCode;
	private String businessName;
	private String type;

	public void setCommonName(String commonName){
		this.commonName = commonName;
	}

	public String getCommonName(){
		return commonName;
	}

	public void setIataCode(String iataCode){
		this.iataCode = iataCode;
	}

	public String getIataCode(){
		return iataCode;
	}

	public void setIcaoCode(String icaoCode){
		this.icaoCode = icaoCode;
	}

	public String getIcaoCode(){
		return icaoCode;
	}

	public void setBusinessName(String businessName){
		this.businessName = businessName;
	}

	public String getBusinessName(){
		return businessName;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}
