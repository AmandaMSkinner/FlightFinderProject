package com.techelevator.TakeOff.models.responses.flightinfo;

public class FareDetailsBySegmentItem{
	private IncludedCheckedBags includedCheckedBags;
	private String fareBasis;
	private String segmentId;
	private String cabin;
	private String jsonMemberClass;
	private String brandedFare;

	public void setIncludedCheckedBags(IncludedCheckedBags includedCheckedBags){
		this.includedCheckedBags = includedCheckedBags;
	}

	public IncludedCheckedBags getIncludedCheckedBags(){
		return includedCheckedBags;
	}

	public void setFareBasis(String fareBasis){
		this.fareBasis = fareBasis;
	}

	public String getFareBasis(){
		return fareBasis;
	}

	public void setSegmentId(String segmentId){
		this.segmentId = segmentId;
	}

	public String getSegmentId(){
		return segmentId;
	}

	public void setCabin(String cabin){
		this.cabin = cabin;
	}

	public String getCabin(){
		return cabin;
	}

	public void setJsonMemberClass(String jsonMemberClass){
		this.jsonMemberClass = jsonMemberClass;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public void setBrandedFare(String brandedFare){
		this.brandedFare = brandedFare;
	}

	public String getBrandedFare(){
		return brandedFare;
	}

	@Override
 	public String toString(){
		return 
			"FareDetailsBySegmentItem{" + 
			"includedCheckedBags = '" + includedCheckedBags + '\'' + 
			",fareBasis = '" + fareBasis + '\'' + 
			",segmentId = '" + segmentId + '\'' + 
			",cabin = '" + cabin + '\'' + 
			",class = '" + jsonMemberClass + '\'' + 
			",brandedFare = '" + brandedFare + '\'' + 
			"}";
		}
}
