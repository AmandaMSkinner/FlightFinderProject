package com.techelevator.Takeoff.models.responses.flightinfo;

public class SegmentsItem{
	private String duration;
	private String number;
	private int numberOfStops;
	private boolean blacklistedInEU;
	private Arrival arrival;
	private String carrierCode;
	private Aircraft aircraft;
	private Departure departure;
	private Operating operating;
	private String id;

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setNumberOfStops(int numberOfStops){
		this.numberOfStops = numberOfStops;
	}

	public int getNumberOfStops(){
		return numberOfStops;
	}

	public void setBlacklistedInEU(boolean blacklistedInEU){
		this.blacklistedInEU = blacklistedInEU;
	}

	public boolean isBlacklistedInEU(){
		return blacklistedInEU;
	}

	public void setArrival(Arrival arrival){
		this.arrival = arrival;
	}

	public Arrival getArrival(){
		return arrival;
	}

	public void setCarrierCode(String carrierCode){
		this.carrierCode = carrierCode;
	}

	public String getCarrierCode(){
		return carrierCode;
	}

	public void setAircraft(Aircraft aircraft){
		this.aircraft = aircraft;
	}

	public Aircraft getAircraft(){
		return aircraft;
	}

	public void setDeparture(Departure departure){
		this.departure = departure;
	}

	public Departure getDeparture(){
		return departure;
	}

	public void setOperating(Operating operating){
		this.operating = operating;
	}

	public Operating getOperating(){
		return operating;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"SegmentsItem{" + 
			"duration = '" + duration + '\'' + 
			",number = '" + number + '\'' + 
			",numberOfStops = '" + numberOfStops + '\'' + 
			",blacklistedInEU = '" + blacklistedInEU + '\'' + 
			",arrival = '" + arrival + '\'' + 
			",carrierCode = '" + carrierCode + '\'' + 
			",aircraft = '" + aircraft + '\'' + 
			",departure = '" + departure + '\'' + 
			",operating = '" + operating + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
