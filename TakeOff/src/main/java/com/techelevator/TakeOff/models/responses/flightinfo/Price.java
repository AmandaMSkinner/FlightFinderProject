package com.techelevator.TakeOff.models.responses.flightinfo;

import com.techelevator.TakeOff.models.responses.flightinfo.AdditionalServicesItem;
import com.techelevator.TakeOff.models.responses.flightinfo.FeesItem;

import java.util.List;

public class Price{
	private List<AdditionalServicesItem> additionalServices;
	private String total;
	private List<FeesItem> fees;
	private String grandTotal;
	private String currency;
	private String base;

	public void setAdditionalServices(List<AdditionalServicesItem> additionalServices){
		this.additionalServices = additionalServices;
	}

	public List<AdditionalServicesItem> getAdditionalServices(){
		return additionalServices;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setFees(List<FeesItem> fees){
		this.fees = fees;
	}

	public List<FeesItem> getFees(){
		return fees;
	}

	public void setGrandTotal(String grandTotal){
		this.grandTotal = grandTotal;
	}

	public String getGrandTotal(){
		return grandTotal;
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

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"additionalServices = '" + additionalServices + '\'' + 
			",total = '" + total + '\'' + 
			",fees = '" + fees + '\'' + 
			",grandTotal = '" + grandTotal + '\'' + 
			",currency = '" + currency + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}