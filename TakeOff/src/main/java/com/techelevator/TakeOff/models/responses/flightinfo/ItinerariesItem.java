package com.techelevator.TakeOff.models.responses.flightinfo;

import java.util.List;

public class ItinerariesItem{
	private String duration;
	private List<SegmentsItem> segments;

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setSegments(List<SegmentsItem> segments){
		this.segments = segments;
	}

	public List<SegmentsItem> getSegments(){
		return segments;
	}

	@Override
 	public String toString(){
		return 
			"ItinerariesItem{" + 
			"duration = '" + duration + '\'' + 
			",segments = '" + segments + '\'' + 
			"}";
		}
}