package com.techelevator.TakeOff.models.responses.hotels;

public class AssociatedRecordsItem{
	private String reference;
	private String originSystemCode;

	public void setReference(String reference){
		this.reference = reference;
	}

	public String getReference(){
		return reference;
	}

	public void setOriginSystemCode(String originSystemCode){
		this.originSystemCode = originSystemCode;
	}

	public String getOriginSystemCode(){
		return originSystemCode;
	}
}
