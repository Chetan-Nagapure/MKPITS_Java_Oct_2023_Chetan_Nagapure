package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaturalNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
    	int number=Integer.parseInt(br.readLine());
		
		
		for (int i=1;i<=number; i++)
		{
			System.out.println(i);
		}
		

	}

}
