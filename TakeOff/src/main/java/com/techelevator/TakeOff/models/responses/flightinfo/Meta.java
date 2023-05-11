package com.techelevator.Takeoff.models.responses.flightinfo;

public class Meta{
	private int count;
	private Links links;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"count = '" + count + '\'' + 
			",links = '" + links + '\'' + 
			"}";
		}
}
