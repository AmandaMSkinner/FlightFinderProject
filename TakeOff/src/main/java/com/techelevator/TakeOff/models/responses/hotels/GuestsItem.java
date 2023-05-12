package com.techelevator.TakeOff.models.responses.hotels;

public class GuestsItem{
	private Contact contact;
	private Name name;
	private int id;

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}
