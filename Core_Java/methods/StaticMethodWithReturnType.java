package com.mkpits.methods;

public class StaticMethodWithReturnType
{

	public static void main(String[] args)
	{
		getDetails();
		System.out.println(getDetails());//direct access
		
		System.out.println(StaticMethodWithReturnType.getDetails());// using class
		
		StaticMethodWithReturnType n=new StaticMethodWithReturnType();//using obj
		System.out.println(n.getDetails());
		
		

	}
	public static String getDetails() 
	
	{
		String Name="chetan";
		return Name;
		
	}

}
