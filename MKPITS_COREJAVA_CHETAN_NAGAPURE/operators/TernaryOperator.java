package com.mkpits.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperator 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
				
				System.out.println("Enter number 1");
				int a=Integer.parseInt(br.readLine());
				
				System.out.println("Enter number 2");
				int b=Integer.parseInt(br.readLine());
				
				
				System.out.println((a>b)?  "a is greater": "b is greater" );    
				String value= (a>b)?"a is greater":"b is greater";
				

	}

}
