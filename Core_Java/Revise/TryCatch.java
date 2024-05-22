package com.mkpits.Revise;

public class TryCatch {

	public static void main(String[] args) 
	{
		try
		{
			int [] numbers = {1,2,3,4,5};
			
			System.out.println(numbers[6]);
		
		} catch(Exception e)
		
		{
			System.out.println("Something went wrong");
		}
		
	}

}
