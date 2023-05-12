package com.techelevator.TakeOff.models.responses.hotels;

public class Price{
	private String total;
	private Variations variations;
	private String currency;
	private String base;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setVariations(Variations variations){
		this.variations = variations;
	}

	public Variations getVariations(){
		return variations;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}
