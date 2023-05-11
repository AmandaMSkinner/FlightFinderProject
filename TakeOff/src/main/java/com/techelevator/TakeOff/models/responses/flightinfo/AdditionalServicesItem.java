package com.techelevator.Takeoff.models.responses.flightinfo;

public class AdditionalServicesItem{
	private String amount;
	private String type;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"AdditionalServicesItem{" + 
			"amount = '" + amount + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}
