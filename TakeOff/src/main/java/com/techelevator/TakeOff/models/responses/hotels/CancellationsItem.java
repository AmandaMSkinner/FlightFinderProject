package com.techelevator.TakeOff.models.responses.hotels;

public class CancellationsItem{
	private String amount;
	private String deadline;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	public String getDeadline(){
		return deadline;
	}
}
