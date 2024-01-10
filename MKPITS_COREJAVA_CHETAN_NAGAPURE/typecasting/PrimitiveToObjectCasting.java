package com.mkpits.typecasting;

public class PrimitiveToObjectCasting {

	public static void main(String[] args) 
	{
		int pincode=440010;
		Integer i=new Integer(pincode);
		System.out.println(i);
		
		char name='S';
		Character uName=new Character(name); //Character-wrapper class
		System.out.println(uName);
		
		int code =001;
		double m=new Double(code);
		System.out.println(m);
		
		long pin=12345;
		float n=new Float(pin);
		System.out.println(n);
		
		
		
		
		
		
	}

}
