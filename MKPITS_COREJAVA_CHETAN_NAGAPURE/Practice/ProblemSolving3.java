package com.mkpits.Practice;

public class ProblemSolving3 {
// Find the Second Largest Number in the array
	public static void main(String[] args) 
	{
		secondlargestNumber();
	}
	public static void secondlargestNumber()
	{
		int arr[]= {10,20,30,40,50,60,70};
		for(int i=0;i<arr.length;i++)
	    System.out.println(arr[i]);
	  
		int LargeNumber=arr[0];
		
			for(int i=0;i<arr.length;i++)
			
              if(LargeNumber <arr[i])
              {
            	  LargeNumber=arr[i];
              }
			  
			  System.out.println();
              System.out.println(LargeNumber);
			
			
			int SecondLargeNumber=0;
			for(int i=0;i<arr.length;i++)
		    if(LargeNumber>arr[i])
		    {
			  SecondLargeNumber=arr[i];	
			}
			System.out.println(SecondLargeNumber);
			
		  }

}
