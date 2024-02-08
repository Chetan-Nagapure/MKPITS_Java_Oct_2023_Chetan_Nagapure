package com.mkpits.exception;

public class LessBalanceException extends Exception 
{
	int amount ;
	
	public LessBalanceException()
	{
		System.out.println("Default constructor called");
	}
	
	public LessBalanceException(int amount)
	{
		this.amount=amount;
	}
	
	
	public String tostring()
	{
		return "you do not have sufficient balance Your balance is"+amount;
	}

	

}
