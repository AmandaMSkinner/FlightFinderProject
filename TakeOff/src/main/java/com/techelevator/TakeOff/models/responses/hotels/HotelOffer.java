package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class HotelOffer {
	private List<OffersItem> offers;
	private boolean available;
	private Hotel hotel;
	private String self;
	private String type;

	public void setOffers(List<OffersItem> offers){
		this.offers = offers;
	}

	public List<OffersItem> getOffers(){
		return offers;
	}

	public void setAvailable(boolean available){
		this.available = available;
	}

	public boolean isAvailable(){
		return available;
	}

	public void setHotel(Hotel hotel){
		this.hotel = hotel;
	}

	public Hotel getHotel(){
		return hotel;
	}

	public void setSelf(String self){
		this.self = self;
	}

	public String getSelf(){
		return self;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}