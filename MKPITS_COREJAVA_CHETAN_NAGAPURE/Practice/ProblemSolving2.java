package com.mkpits.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemSolving2 {
 
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		operation();

	}
	private static void operation() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	      
		char ch='y';
		
		while(ch=='y' || ch=='Y')
		{
			System.out.println("Enter Your Choice : \n1 Addition \n2 Subtraction \n3 Multiplication \n4 Division ");
			int choice=Integer.parseInt(br.readLine());
			
			int num1,num2,Add,Sub,Mul,Div;
			 
			System.out.println("Enter the First Number");
		    num1=Integer.parseInt(br.readLine());
		      
		    System.out.println("Enter the Second Number");
		    num2=Integer.parseInt(br.readLine());
			
			switch (choice) 
			{
		
			case 1:
				
				      Add=num1 + num2;
				      System.out.println("Addition :"+Add );
				      break;
				
			case 2:
				      Sub=num1 - num2;
			          System.out.println("Subtraction :"+Sub );
			          break;
				   
			case 3:
				      Mul=num1 * num2;
		              System.out.println("Multiplication :"+Mul );
		              break;
			   
			case 4:
				     
				      Div=num1 / num2;
		              System.out.println("Division :"+Div );
		              break;
			   
		   default:
				 
				System.out.println("invalid");
			
			}
				    
			System.out.println("Do you want to Continue Y/N");
			ch=(char)br.read();
			br.readLine();
		}
	}
}
		
		
		


