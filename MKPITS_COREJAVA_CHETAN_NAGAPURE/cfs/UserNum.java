package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNum {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int x=Integer.parseInt(br.readLine());
		
		if(x%2==0)
		{
			System.out.println(x+ " is even number");
		}
		else
		{
			System.out.println(x+ " is odd number");
		}
		
	}

}
