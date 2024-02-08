package com.mkpits.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {

	public static void main(String[] args) throws NumberFormatException, IOException
	
	{
	    int num1=0,num2=0;
	    int result=0,res=0;
	    		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int number=Integer.parseInt(br.readLine());
		
		while(number !=0)
		{
			num2=number % 10;
		    result=result + num2;
			number=number/10;
					
		}
		
		while(result !=0)
			{
			num1=result % 10;
			res =res + num1;
			result=result/10;
			}
		
		System.out.println(res);
	}

}
