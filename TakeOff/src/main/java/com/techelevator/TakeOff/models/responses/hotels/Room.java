package com.techelevator.TakeOff.models.responses.hotels;

public class Room{
	private TypeEstimated typeEstimated;
	private Description description;
	private String type;

	public void setTypeEstimated(TypeEstimated typeEstimated){
		this.typeEstimated = typeEstimated;
	}

	public TypeEstimated getTypeEstimated(){
		return typeEstimated;
	}

	public void setDescription(Description description){
		this.description = description;
	}

	public Description getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}
