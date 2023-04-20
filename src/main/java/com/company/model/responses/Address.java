package com.company.model.responses;

public class Address{
	private String countryCode;

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"countryCode = '" + countryCode + '\'' + 
			"}";
		}
}
