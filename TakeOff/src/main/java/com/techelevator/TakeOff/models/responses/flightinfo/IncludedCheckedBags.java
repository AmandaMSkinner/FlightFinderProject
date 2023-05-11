package com.techelevator.Takeoff.models.responses.flightinfo;

public class IncludedCheckedBags{
	private int quantity;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	@Override
 	public String toString(){
		return 
			"IncludedCheckedBags{" + 
			"quantity = '" + quantity + '\'' + 
			"}";
		}
}
