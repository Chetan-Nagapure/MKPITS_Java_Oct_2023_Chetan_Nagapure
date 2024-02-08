package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterNum 
{


	public static void main(String[] args) throws NumberFormatException, IOException
	{
      //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Compare();
	}
	public static void Compare() throws NumberFormatException, IOException
	{
        
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first number");
		int x=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second number");
		int y=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the third number");
		int z=Integer.parseInt(br.readLine());
		
		if(x>y && x>z)
		{
			System.out.println(x + " is greater than " + y + " and " + z);
			System.out.println("First number is greater");
		}
		else if(y>x && y>z)
		{
			System.out.println(y + " is greater than " + x + " and " + z);
			System.out.println("Second number is greater");
		}
		else if(z>x && z>y)
		{
			System.out.println(z + " is greater than " + x + " and " + y);
			System.out.println("Third number is greater");
		}
		else
		{
			System.out.println("All numbers are equal");
		}
		
	}

}
