package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIfCFS 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first no");
		int num1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter second no");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println("Enter third no");
		int num3=Integer.parseInt(br.readLine());
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Number first is greater");
		}
		else if(num2 > num1 && num2 > num3)
		{
		  System.out.println("Number second is greater");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("Number third is greater");
		}

	}

}