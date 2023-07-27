package com.techelevator.TakeOff.models.responses.flightCodes;

import java.util.List;

public class Response{
	private List<DataItem> data;
	private Meta meta;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}
}