package com.techelevator.TakeOff.models.responses.hotels;

public class Description{
	private String text;
	private String lang;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setLang(String lang){
		this.lang = lang;
	}

	public String getLang(){
		return lang;
	}
}
