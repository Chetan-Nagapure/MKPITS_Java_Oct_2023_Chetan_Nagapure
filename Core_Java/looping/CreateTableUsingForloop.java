package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateTableUsingForloop 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int number=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=10 ; i++)
		{
			int table=number*i;
		
			
			System.out.println((+number+ "*" +i+ "=" +table));
			
		}
		
		
	}

}
