package com.techelevator.TakeOff.models.responses.flightinfo;

public class Aircraft{
	private String jsonMember221;
	private String jsonMember320;
	private String jsonMember223;
	private String jsonMember333;
	private String jsonMember290;
	private String code;

	public void setJsonMember221(String jsonMember221){
		this.jsonMember221 = jsonMember221;
	}

	public String getJsonMember221(){
		return jsonMember221;
	}

	public void setJsonMember320(String jsonMember320){
		this.jsonMember320 = jsonMember320;
	}

	public String getJsonMember320(){
		return jsonMember320;
	}

	public void setJsonMember223(String jsonMember223){
		this.jsonMember223 = jsonMember223;
	}

	public String getJsonMember223(){
		return jsonMember223;
	}

	public void setJsonMember333(String jsonMember333){
		this.jsonMember333 = jsonMember333;
	}

	public String getJsonMember333(){
		return jsonMember333;
	}

	public void setJsonMember290(String jsonMember290){
		this.jsonMember290 = jsonMember290;
	}

	public String getJsonMember290(){
		return jsonMember290;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"Aircraft{" + 
			"221 = '" + jsonMember221 + '\'' + 
			",320 = '" + jsonMember320 + '\'' + 
			",223 = '" + jsonMember223 + '\'' + 
			",333 = '" + jsonMember333 + '\'' + 
			",290 = '" + jsonMember290 + '\'' + 
			",code = '" + code + '\'' + 
			"}";
		}
}
