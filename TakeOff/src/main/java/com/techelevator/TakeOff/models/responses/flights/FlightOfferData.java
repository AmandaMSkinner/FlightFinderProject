package com.techelevator.TakeOff.models.responses.flights;

import com.techelevator.TakeOff.models.responses.flightinfo.FlightOffer;
import com.techelevator.TakeOff.models.responses.flightinfo.Dictionaries;
import com.techelevator.TakeOff.models.responses.flightinfo.Meta;

import java.util.List;

public class FlightOfferData{
	private List<FlightOffer> data;
	private Meta meta;
	private Dictionaries dictionaries;

	public void setData(List<FlightOffer> data){
		this.data = data;
	}

	public List<FlightOffer> getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setDictionaries(Dictionaries dictionaries){
		this.dictionaries = dictionaries;
	}

	public Dictionaries getDictionaries(){
		return dictionaries;
	}

	@Override
 	public String toString(){
		return 
			"FlightOfferData{" + 
			"data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			",dictionaries = '" + dictionaries + '\'' + 
			"}";
		}
}