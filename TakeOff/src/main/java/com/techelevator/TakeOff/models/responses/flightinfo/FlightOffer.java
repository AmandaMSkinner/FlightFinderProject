package com.techelevator.TakeOff.models.responses.flightinfo;

import java.util.List;

public class FlightOffer {
	private int numberOfBookableSeats;
	private List<TravelerPricingsItem> travelerPricings;
	private boolean instantTicketingRequired;
	private List<String> validatingAirlineCodes;
	private String source;
	private String type;
	private boolean oneWay;
	private Price price;
	private PricingOptions pricingOptions;
	private boolean nonHomogeneous;
	private List<ItinerariesItem> itineraries;
	private String lastTicketingDate;
	private String id;
	private String lastTicketingDateTime;

	public void setNumberOfBookableSeats(int numberOfBookableSeats){
		this.numberOfBookableSeats = numberOfBookableSeats;
	}

	public int getNumberOfBookableSeats(){
		return numberOfBookableSeats;
	}

	public void setTravelerPricings(List<TravelerPricingsItem> travelerPricings){
		this.travelerPricings = travelerPricings;
	}

	public List<TravelerPricingsItem> getTravelerPricings(){
		return travelerPricings;
	}

	public void setInstantTicketingRequired(boolean instantTicketingRequired){
		this.instantTicketingRequired = instantTicketingRequired;
	}

	public boolean isInstantTicketingRequired(){
		return instantTicketingRequired;
	}

	public void setValidatingAirlineCodes(List<String> validatingAirlineCodes){
		this.validatingAirlineCodes = validatingAirlineCodes;
	}

	public List<String> getValidatingAirlineCodes(){
		return validatingAirlineCodes;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setOneWay(boolean oneWay){
		this.oneWay = oneWay;
	}

	public boolean isOneWay(){
		return oneWay;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setPricingOptions(PricingOptions pricingOptions){
		this.pricingOptions = pricingOptions;
	}

	public PricingOptions getPricingOptions(){
		return pricingOptions;
	}

	public void setNonHomogeneous(boolean nonHomogeneous){
		this.nonHomogeneous = nonHomogeneous;
	}

	public boolean isNonHomogeneous(){
		return nonHomogeneous;
	}

	public void setItineraries(List<ItinerariesItem> itineraries){
		this.itineraries = itineraries;
	}

	public List<ItinerariesItem> getItineraries(){
		return itineraries;
	}

	public void setLastTicketingDate(String lastTicketingDate){
		this.lastTicketingDate = lastTicketingDate;
	}

	public String getLastTicketingDate(){
		return lastTicketingDate;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setLastTicketingDateTime(String lastTicketingDateTime){
		this.lastTicketingDateTime = lastTicketingDateTime;
	}

	public String getLastTicketingDateTime(){
		return lastTicketingDateTime;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"numberOfBookableSeats = '" + numberOfBookableSeats + '\'' + 
			",travelerPricings = '" + travelerPricings + '\'' + 
			",instantTicketingRequired = '" + instantTicketingRequired + '\'' + 
			",validatingAirlineCodes = '" + validatingAirlineCodes + '\'' + 
			",source = '" + source + '\'' + 
			",type = '" + type + '\'' + 
			",oneWay = '" + oneWay + '\'' + 
			",price = '" + price + '\'' + 
			",pricingOptions = '" + pricingOptions + '\'' + 
			",nonHomogeneous = '" + nonHomogeneous + '\'' + 
			",itineraries = '" + itineraries + '\'' + 
			",lastTicketingDate = '" + lastTicketingDate + '\'' + 
			",id = '" + id + '\'' + 
			",lastTicketingDateTime = '" + lastTicketingDateTime + '\'' + 
			"}";
		}
}