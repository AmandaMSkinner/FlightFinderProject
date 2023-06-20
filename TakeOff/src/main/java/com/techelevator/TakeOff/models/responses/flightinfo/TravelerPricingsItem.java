package com.techelevator.TakeOff.models.responses.flightinfo;

import java.util.List;

public class TravelerPricingsItem{
	private String travelerType;
	private Price price;
	private String fareOption;
	private List<FareDetailsBySegmentItem> fareDetailsBySegment;
	private String travelerId;

	public void setTravelerType(String travelerType){
		this.travelerType = travelerType;
	}

	public String getTravelerType(){
		return travelerType;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setFareOption(String fareOption){
		this.fareOption = fareOption;
	}

	public String getFareOption(){
		return fareOption;
	}

	public void setFareDetailsBySegment(List<FareDetailsBySegmentItem> fareDetailsBySegment){
		this.fareDetailsBySegment = fareDetailsBySegment;
	}

	public List<FareDetailsBySegmentItem> getFareDetailsBySegment(){
		return fareDetailsBySegment;
	}

	public void setTravelerId(String travelerId){
		this.travelerId = travelerId;
	}

	public String getTravelerId(){
		return travelerId;
	}

	@Override
 	public String toString(){
		return 
			"TravelerPricingsItem{" + 
			"travelerType = '" + travelerType + '\'' + 
			",price = '" + price + '\'' + 
			",fareOption = '" + fareOption + '\'' + 
			",fareDetailsBySegment = '" + fareDetailsBySegment + '\'' + 
			",travelerId = '" + travelerId + '\'' + 
			"}";
		}
}