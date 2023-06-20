package com.techelevator.TakeOff.models.responses.flightinfo;

import java.util.List;

public class PricingOptions{
	private boolean includedCheckedBagsOnly;
	private List<String> fareType;

	public void setIncludedCheckedBagsOnly(boolean includedCheckedBagsOnly){
		this.includedCheckedBagsOnly = includedCheckedBagsOnly;
	}

	public boolean isIncludedCheckedBagsOnly(){
		return includedCheckedBagsOnly;
	}

	public void setFareType(List<String> fareType){
		this.fareType = fareType;
	}

	public List<String> getFareType(){
		return fareType;
	}

	@Override
 	public String toString(){
		return 
			"PricingOptions{" + 
			"includedCheckedBagsOnly = '" + includedCheckedBagsOnly + '\'' + 
			",fareType = '" + fareType + '\'' + 
			"}";
		}
}