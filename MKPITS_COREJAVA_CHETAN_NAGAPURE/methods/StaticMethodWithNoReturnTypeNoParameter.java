package com.mkpits.methods;

public class StaticMethodWithNoReturnTypeNoParameter
{

	public static void main(String[] args) 
	{
	 //direct access
		fetchData();
		
		//using classname
		StaticMethodWithNoReturnTypeNoParameter.fetchData();
		
		//using obj
		StaticMethodWithNoReturnTypeNoParameter m=new StaticMethodWithNoReturnTypeNoParameter();
		m.fetchData();
		

	}
	
	public static void fetchData() //void-No return
	{
		String lastName="Nagapure";
		System.out.println(lastName);
	}

}
