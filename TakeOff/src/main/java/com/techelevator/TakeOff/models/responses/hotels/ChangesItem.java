package com.techelevator.TakeOff.models.responses.hotels;

public class ChangesItem{
	private String endDate;
	private String startDate;
	private String base;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}
