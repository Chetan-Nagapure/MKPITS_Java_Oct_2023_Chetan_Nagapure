package com.mkpits.scopeofvariable;

public class StaticVariableCallingThroghObject 
{

	public static void main(String[] args) 
	{
		StaticScopeVariable ssv=new StaticScopeVariable();
		System.out.println(ssv.num);

	}

}
