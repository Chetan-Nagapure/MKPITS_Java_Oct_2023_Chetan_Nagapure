package com.mkpits.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Largestnumberinarray {

	//find the greatest number in array and find the factorial of that number
	
	public static void main(String[] args) 
	{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]= {2,4,5,8,31};
		
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("Elements in ascending order :"+arr[i]);
        }
        
        int largenum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	if(largenum<arr[i])
        	{
        		largenum=arr[i];
        	}
        	
        }
        
        System.out.println();
        System.out.println("Largest number of array is :"+largenum);
        
        int fact=1;
        for(int i=1;i<largenum;i++)
        {
        	fact=fact * i;
        }
        System.out.println("Factorial of " +largenum +" is :" +fact);
        
        
        		
	}

}
