package com.techelevator.TakeOff.models.responses.locations;

public class GeoCode{
	private Object latitude;
	private Object longitude;

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}
}
