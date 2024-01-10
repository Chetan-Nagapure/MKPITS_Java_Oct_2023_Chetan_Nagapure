package com.mkpits.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemSolving 
{
//delete the duplicate element in array and print the index of that element. 
	public static void main(String[] args)
	{
  //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[]= {10,20,30,40,50,20};
	System.out.println("length of array is : " +arr.length);
	System.out.println();
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==arr[1])
		{
			continue;
		}
		System.out.println(arr[i]);
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==arr[1])
		{
			System.out.println(i);
		}
			
			
	}
	
	
			
	}

}
