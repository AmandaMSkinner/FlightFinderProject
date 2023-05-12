package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class RoomsItem{
	private List<Integer> guestIds;
	private int paymentId;
	private String specialRequest;

	public void setGuestIds(List<Integer> guestIds){
		this.guestIds = guestIds;
	}

	public List<Integer> getGuestIds(){
		return guestIds;
	}

	public void setPaymentId(int paymentId){
		this.paymentId = paymentId;
	}

	public int getPaymentId(){
		return paymentId;
	}

	public void setSpecialRequest(String specialRequest){
		this.specialRequest = specialRequest;
	}

	public String getSpecialRequest(){
		return specialRequest;
	}
}