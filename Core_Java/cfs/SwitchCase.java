package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Operation();

	}
	private static void Operation() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit \n Enter your choice");
        
		int x=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the first number");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second number");
		int b=Integer.parseInt(br.readLine());
		
		int c=0;
		
		switch(x)
		{
		case 1:c=a+b;
		System.out.println("Additon of " + a + " and " + b + " = " + c);
	    break;
		
		case 2:c=a-b;
		System.out.println("Subtraction of " + a + " and " + b + " = " + c);
		break;
		
		case 3:c=a*b;
		System.out.println("Multiplication of " + a + " and " + b + " = " + c );
		break;
		
		case 4:c=a/b;
		System.out.println("Division of " + a + " and " + b + " = " + c);
		break;
		
		case 5:System.exit(0);
	    break;
		
		default:System.out.println("Envalid choice");
			
		
		}
	}

}
