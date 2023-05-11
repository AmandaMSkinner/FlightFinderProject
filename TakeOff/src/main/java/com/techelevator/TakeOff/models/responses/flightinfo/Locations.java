package com.techelevator.Takeoff.models.responses.flightinfo;

public class Locations{
	private ZRH zRH;
	private LCY lCY;
	private LHR lHR;
	private DEL dEL;

	public void setZRH(ZRH zRH){
		this.zRH = zRH;
	}

	public ZRH getZRH(){
		return zRH;
	}

	public void setLCY(LCY lCY){
		this.lCY = lCY;
	}

	public LCY getLCY(){
		return lCY;
	}

	public void setLHR(LHR lHR){
		this.lHR = lHR;
	}

	public LHR getLHR(){
		return lHR;
	}

	public void setDEL(DEL dEL){
		this.dEL = dEL;
	}

	public DEL getDEL(){
		return dEL;
	}

	@Override
 	public String toString(){
		return 
			"Locations{" + 
			"zRH = '" + zRH + '\'' + 
			",lCY = '" + lCY + '\'' + 
			",lHR = '" + lHR + '\'' + 
			",dEL = '" + dEL + '\'' + 
			"}";
		}
}
