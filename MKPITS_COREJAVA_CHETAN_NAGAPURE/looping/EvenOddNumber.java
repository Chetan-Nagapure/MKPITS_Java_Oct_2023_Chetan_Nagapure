package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int a=Integer.parseInt(br.readLine());
		
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else 
		{
			System.out.println("number is odd");
		}
	}

}
