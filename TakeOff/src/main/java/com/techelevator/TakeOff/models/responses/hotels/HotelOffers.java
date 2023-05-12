package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HotelOffers{
	@JsonProperty("data")
	private List<HotelOffer> hotelOffers;

	public void setHotelOffers(List<HotelOffer> hotelOffers){
		this.hotelOffers = hotelOffers;
	}

	public List<HotelOffer> getHotelOffers(){
		return hotelOffers;
	}
}