package com.techelevator.TakeOff.models.responses.hotels;

public class OffersItem{
	private String checkOutDate;
	private Price price;
	private Guests guests;
	private Policies policies;
	private String self;
	private RateFamilyEstimated rateFamilyEstimated;
	private String id;
	private String checkInDate;
	private String rateCode;
	private Room room;

	public void setCheckOutDate(String checkOutDate){
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutDate(){
		return checkOutDate;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setGuests(Guests guests){
		this.guests = guests;
	}

	public Guests getGuests(){
		return guests;
	}

	public void setPolicies(Policies policies){
		this.policies = policies;
	}

	public Policies getPolicies(){
		return policies;
	}

	public void setSelf(String self){
		this.self = self;
	}

	public String getSelf(){
		return self;
	}

	public void setRateFamilyEstimated(RateFamilyEstimated rateFamilyEstimated){
		this.rateFamilyEstimated = rateFamilyEstimated;
	}

	public RateFamilyEstimated getRateFamilyEstimated(){
		return rateFamilyEstimated;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCheckInDate(String checkInDate){
		this.checkInDate = checkInDate;
	}

	public String getCheckInDate(){
		return checkInDate;
	}

	public void setRateCode(String rateCode){
		this.rateCode = rateCode;
	}

	public String getRateCode(){
		return rateCode;
	}

	public void setRoom(Room room){
		this.room = room;
	}

	public Room getRoom(){
		return room;
	}
}
