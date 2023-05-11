package com.techelevator.Takeoff.models.responses.flightinfo;

public class DEL{
	private String cityCode;
	private String countryCode;

	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	public String getCityCode(){
		return cityCode;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	@Override
 	public String toString(){
		return 
			"DEL{" + 
			"cityCode = '" + cityCode + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			"}";
		}
}
