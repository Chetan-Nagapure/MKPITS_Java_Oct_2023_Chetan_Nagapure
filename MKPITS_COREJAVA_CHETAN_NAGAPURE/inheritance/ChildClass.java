package com.mkpits.inheritance;

public class ChildClass extends Parentclass 
{
	long mobile;
	char gender;
	int pincode;
	
	public void getMobile(long mobile) 
	{
		this.mobile=mobile;
		
	}
	
	public void getGender(char gender) 
	{
		this.gender=gender;
		
	}
	
	public void getPincode(int pincode) 
	{
		this.pincode=pincode;
		
	}
	
	public void getAllDetails() 
	{
		System.out.println("First Name :"+fname);
		System.out.println("Last Name :"+lname);
		System.out.println("Email :"+email);
		System.out.println("Mobile :"+mobile);
		System.out.println("Gender :"+gender);
		System.out.println("Pincode :"+pincode);
		
	}

}
