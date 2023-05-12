package com.techelevator.TakeOff.models.responses.hotels;

public class PaymentsItem{
	private String method;
	private int id;
	private Card card;

	public void setMethod(String method){
		this.method = method;
	}

	public String getMethod(){
		return method;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCard(Card card){
		this.card = card;
	}

	public Card getCard(){
		return card;
	}
}
