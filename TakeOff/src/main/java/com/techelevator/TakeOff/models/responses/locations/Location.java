package com.techelevator.TakeOff.models.responses.locations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	private Address address;
	private String name;
	private GeoCode geoCode;
	private String subType;
	private String type;
	private String iataCode;

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGeoCode(GeoCode geoCode){
		this.geoCode = geoCode;
	}

	public GeoCode getGeoCode(){
		return geoCode;
	}

	public void setSubType(String subType){
		this.subType = subType;
	}

	public String getSubType(){
		return subType;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setIataCode(String iataCode){
		this.iataCode = iataCode;
	}

	public String getIataCode(){
		return iataCode;
	}
}
