package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class Policies{
	private List<CancellationsItem> cancellations;
	private String paymentType;

	public void setCancellations(List<CancellationsItem> cancellations){
		this.cancellations = cancellations;
	}

	public List<CancellationsItem> getCancellations(){
		return cancellations;
	}

	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}

	public String getPaymentType(){
		return paymentType;
	}
}