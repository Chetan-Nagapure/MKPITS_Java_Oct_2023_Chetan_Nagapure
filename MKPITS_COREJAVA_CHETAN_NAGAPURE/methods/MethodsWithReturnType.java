package com.mkpits.methods;

public class MethodsWithReturnType 
{

	public static void main(String[] args) 
	{
		MethodsWithReturnType m=new MethodsWithReturnType();
		
		String mobile=m.getDetails();//1 way
		System.out.println(mobile);
		
		int pin=m.getpin();
		System.out.println(pin);
		
		System.out.println(m.getDetails());//2 way
		System.out.println(m.getpin());

	}
	
	public String getDetails() 
	{
		String mobile="7722058614";
				return mobile;
	}
	
	public int getpin() 
	{
		int pin=123;
		return pin;
	}

}
