package com.mkpits.scopeofvariable;

public class StaticScopeVariable
{
    // static variable declare through out the class
	//static variables always declare with static keywords.
	
	
	static int num=2345;
	
	public static void main(String[] args) 
	{
		System.out.println(num);
		
		StaticScopeVariable obj=new StaticScopeVariable();
		System.out.println(obj.num);
		
		
	}
	
	public void shivani()
	{
		System.out.println(num);
	}
	
	
	
	
	
	

}
