package com.techelevator.TakeOff.models.responses.hotels;

public class Card{
	private String expiryDate;
	private String cardNumber;
	private String vendorCode;

	public void setExpiryDate(String expiryDate){
		this.expiryDate = expiryDate;
	}

	public String getExpiryDate(){
		return expiryDate;
	}

	public void setCardNumber(String cardNumber){
		this.cardNumber = cardNumber;
	}

	public String getCardNumber(){
		return cardNumber;
	}

	public void setVendorCode(String vendorCode){
		this.vendorCode = vendorCode;
	}

	public String getVendorCode(){
		return vendorCode;
	}
}
