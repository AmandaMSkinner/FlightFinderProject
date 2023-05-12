package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class DataItem{
	private List<String> amenities;
	private String iataCode;
	private Address address;
	private String chainCode;
	private String lastUpdate;
	private int dupeId;
	private String name;
	private int rating;
	private GeoCode geoCode;
	private String hotelId;

	public void setAmenities(List<String> amenities){
		this.amenities = amenities;
	}

	public List<String> getAmenities(){
		return amenities;
	}

	public void setIataCode(String iataCode){
		this.iataCode = iataCode;
	}

	public String getIataCode(){
		return iataCode;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setChainCode(String chainCode){
		this.chainCode = chainCode;
	}

	public String getChainCode(){
		return chainCode;
	}

	public void setLastUpdate(String lastUpdate){
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdate(){
		return lastUpdate;
	}

	public void setDupeId(int dupeId){
		this.dupeId = dupeId;
	}

	public int getDupeId(){
		return dupeId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setGeoCode(GeoCode geoCode){
		this.geoCode = geoCode;
	}

	public GeoCode getGeoCode(){
		return geoCode;
	}

	public void setHotelId(String hotelId){
		this.hotelId = hotelId;
	}

	public String getHotelId(){
		return hotelId;
	}
}