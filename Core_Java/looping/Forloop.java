package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Forloop
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int i,fact=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number");
		int number=Integer.parseInt(br.readLine());
				
				for(i=1; i<=number; i++)
				{
					fact=fact *i;
				}
				System.out.println("Factorial of:"+ number + "is:" +fact);
				
				
	}

}
