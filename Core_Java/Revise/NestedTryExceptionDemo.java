package com.mkpits.Revise;

public class NestedTryExceptionDemo {

	public static void main(String[] args) 
	{
		try {
		
			try {
		
				  System.out.println("going to divide by zero");
		 		  int a = 2/0;
		        } 
		catch (ArithmeticException e) 
			{
			
		      e.printStackTrace();
		    }
			System.out.println("succeded");
		
		}
		catch (Exception e) 
		{
			
		}

	}

}


