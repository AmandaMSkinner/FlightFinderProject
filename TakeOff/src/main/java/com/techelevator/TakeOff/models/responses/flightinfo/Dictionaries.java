package com.techelevator.TakeOff.models.responses.flightinfo;

public class Dictionaries{
	private Aircraft aircraft;
	private Locations locations;
	private Carriers carriers;
	private Currencies currencies;

	public void setAircraft(Aircraft aircraft){
		this.aircraft = aircraft;
	}

	public Aircraft getAircraft(){
		return aircraft;
	}

	public void setLocations(Locations locations){
		this.locations = locations;
	}

	public Locations getLocations(){
		return locations;
	}

	public void setCarriers(Carriers carriers){
		this.carriers = carriers;
	}

	public Carriers getCarriers(){
		return carriers;
	}

	public void setCurrencies(Currencies currencies){
		this.currencies = currencies;
	}

	public Currencies getCurrencies(){
		return currencies;
	}

	@Override
 	public String toString(){
		return 
			"Dictionaries{" + 
			"aircraft = '" + aircraft + '\'' + 
			",locations = '" + locations + '\'' + 
			",carriers = '" + carriers + '\'' + 
			",currencies = '" + currencies + '\'' + 
			"}";
		}
}
