package com.mkpits.inheritance;

public class C1class extends P1class
{
  long mobile;
  char gender;
  int age;
  
  
	public void getAllDetails()
	{
		System.out.println("First name:"+fname);
		System.out.println("Last name:"+lname);
		System.out.println("Email:"+email);
		System.out.println("Mobile :"+mobile);
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);
		
		
	}
	public void getDetail(long mobile,char gender, int age)
	{
		this.mobile=mobile;
		this.gender=gender;
		this.age=age;
		
	}
	
	
}
