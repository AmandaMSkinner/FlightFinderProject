package com.techelevator.TakeOff.models.responses.hotels;

public class TypeEstimated{
	private String category;
	private int beds;
	private String bedType;

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setBeds(int beds){
		this.beds = beds;
	}

	public int getBeds(){
		return beds;
	}

	public void setBedType(String bedType){
		this.bedType = bedType;
	}

	public String getBedType(){
		return bedType;
	}
}
