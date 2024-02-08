package com.mkpits.methods;

public class Details
{
private String name;
private int id;
private int pincode,citycode;

public Details(String name,int id, int pincode, int citycode)
{
	this.name=name;
	this.id=id;
	this.pincode=pincode;
	this.citycode=citycode;

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public int getCitycode() {
	return citycode;
}

public void setCitycode(int citycode) {
	this.citycode = citycode;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}

}
