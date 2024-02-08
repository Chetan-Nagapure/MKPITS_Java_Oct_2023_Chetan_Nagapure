package com.mkpits.cfs;

public class WhileLoop2 {

	public static void main(String[] args) 
	{
		Sum();
	}
	public static void Sum()
	{
		int x=1 , sum=0;
		while(x<=10)
		{
		  sum=sum+x;
		  
		  x++;
		}
		System.out.println("Summation :" +sum);
		
	}

}
