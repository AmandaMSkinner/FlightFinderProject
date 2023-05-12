package com.techelevator.TakeOff.models.responses.hotels;

public class TaxesItem{
	private String pricingMode;
	private String amount;
	private String code;
	private String currency;
	private String pricingFrequency;
	private boolean included;

	public void setPricingMode(String pricingMode){
		this.pricingMode = pricingMode;
	}

	public String getPricingMode(){
		return pricingMode;
	}

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setPricingFrequency(String pricingFrequency){
		this.pricingFrequency = pricingFrequency;
	}

	public String getPricingFrequency(){
		return pricingFrequency;
	}

	public void setIncluded(boolean included){
		this.included = included;
	}

	public boolean isIncluded(){
		return included;
	}
}
