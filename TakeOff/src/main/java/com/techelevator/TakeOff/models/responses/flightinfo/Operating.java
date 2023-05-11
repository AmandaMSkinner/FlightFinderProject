package com.techelevator.Takeoff.models.responses.flightinfo;

public class Operating{
	private String carrierCode;

	public void setCarrierCode(String carrierCode){
		this.carrierCode = carrierCode;
	}

	public String getCarrierCode(){
		return carrierCode;
	}

	@Override
 	public String toString(){
		return 
			"Operating{" + 
			"carrierCode = '" + carrierCode + '\'' + 
			"}";
		}
}
