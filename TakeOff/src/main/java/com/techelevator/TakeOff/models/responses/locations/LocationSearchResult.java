package com.techelevator.TakeOff.models.responses.locations;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LocationSearchResult{
	@JsonProperty("data")
	private List<Location> locations;
	private Meta meta;

	public void setLocations(List<Location> data){
		this.locations = data;
	}

	public List<Location> getLocations(){
		return locations;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}
}