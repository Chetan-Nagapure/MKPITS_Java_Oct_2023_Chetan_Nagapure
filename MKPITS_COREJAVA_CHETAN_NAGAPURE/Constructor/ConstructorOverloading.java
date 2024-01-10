package com.mkpits.Constructor;

public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorOverloading obj=new ConstructorOverloading();
		//System.out.println(obj);
		
		ConstructorOverloading obj1=new ConstructorOverloading(10,10.2f);

	}
 public ConstructorOverloading()//No argument constructor
 {
	System.out.println("welcome");
 }
 public ConstructorOverloading(int a,float b)//parameterized constructor
 {
	 System.out.println(a);
	 System.out.println(b);
 }
 
}
