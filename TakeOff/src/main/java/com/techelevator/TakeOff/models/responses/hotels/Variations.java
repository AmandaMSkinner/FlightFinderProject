package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class Variations{
	private Average average;
	private List<ChangesItem> changes;

	public void setAverage(Average average){
		this.average = average;
	}

	public Average getAverage(){
		return average;
	}

	public void setChanges(List<ChangesItem> changes){
		this.changes = changes;
	}

	public List<ChangesItem> getChanges(){
		return changes;
	}
}