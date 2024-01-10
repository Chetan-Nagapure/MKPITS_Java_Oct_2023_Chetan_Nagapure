package com.mkpits.Practice;

import java.util.Arrays;

public class ProblemSolving4 
{
	//second way to find the second largest number in the array.
	public static void main(String[] args) 
	{
		secondlargestNumber();
	}
	 public static void  secondlargestNumber()
	{
		int Num[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<Num.length;i++)
			Arrays.sort(Num);
	  
		{
		System.out.println("Second largest number :" +Num[Num.length-2]);
		}
	
	}

}
