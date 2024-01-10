package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCFS
{
static BufferedReader br;

public static void main(String[] args) throws NumberFormatException, IOException 
	{
		SwitchCFS s1=new SwitchCFS();
		
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice:\n1 create account \n2 deposit \n3 withdraw \n4 check balance");
		int choice=Integer.parseInt(br.readLine());
		  
		switch (choice) 
		{
		case 1:
			s1.crateAccount();
			break;
			
		case 2:
			s1.deposit();
			
		case 3:
			s1.withdraw();
			
		case 4:
			s1.checkBalance();
			 
		

		default:
			break;
		}
	

}

private void crateAccount() throws IOException 

{
	System.out.println("Enter account holder name");
	String name=br.readLine();
	
	System.out.println("Enter address");
	String address=br.readLine();
	
	System.out.println("Enter age");
	int age=Integer.parseInt(br.readLine());
	
	System.out.println("Enter Mobile");
	int Mobile=Integer.parseInt(br.readLine());
	
	System.out.println("Enter Email");;
	String Email=br.readLine();
	
	System.out.println("Name =" +name);
	System.out.println("Address=" +address);
	System.out.println("Age=" +age);
	System.out.println("Mobile=" +Mobile);
	System.out.println("Email=" +Email);
	
	
}


private void deposit() throws NumberFormatException, IOException 
{
	System.out.println("Enter the deposit amount");
	int amount=Integer.parseInt(br.readLine());
}

private void withdraw() throws NumberFormatException, IOException
{
	System.out.println("Enter the withdraw amount");
	int amount=Integer.parseInt(br.readLine());
	
}

private void checkBalance() throws NumberFormatException, IOException
{
	System.out.println("check balance");
	int balance=Integer.parseInt(br.readLine());
	
}
}




