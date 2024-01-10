package com.mkpits.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber 
{
 
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		PerfectNumber pr=new PerfectNumber();
		pr.getPerfectNumber();

	}

	private void getPerfectNumber() throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		System.out.println("Enter the number");
	    int num=Integer.parseInt(br.readLine());
	    for(int i=1; i<num;i++)
	    {
	    	if(num % i == 0)
	    	{
	    		sum = sum + i;
	    	}
	    	
	    }
	    if(sum==num)
    	{
    		System.out.println("Perfect Number");
    	}
    	else
    	{
    		System.out.println("Imperfect Number");
    	}
    	
	    
	}

}
