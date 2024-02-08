package com.mkpits.cfs;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Whileloop1 

{
	String name,address,gender,email;
	int age,mobile,accountNumber,number,amount,amount1;
	double balance=89000;
	int deposit,withdraw;
	
	static BufferedReader br;

	public static void main(String[] args) throws IOException 
	{
		Whileloop1 w1=new Whileloop1();
		
		br =new BufferedReader(new InputStreamReader(System.in));
		char ch='y';
		
		while (ch=='y' || ch== 'Y')
		{
			System.out.println("Enter your choice:\n1 create account \n2 deposit \n3 withdraw \n4 check balance \n5 accountDetails");
			int choice=Integer.parseInt(br.readLine());
			
			switch (choice) 
			{
			case 1:
				w1.createAccount();
				
				break;
			case 2:
				w1.deposit();
				break;
			case 3:
				w1.withdraw();
				break;
				
			case 4:
				w1.checkBalance();
				break;
				
			case 5:
				w1.accounDetails();
				break;
			
			default:
				break;
			  
		}
			System.out.println("Do you want to continue Y/N");
			ch=(char)br.read();
			br.readLine();
			
		}

}
	
	
	private void createAccount() throws IOException 
	{
		System.out.println("Enter account holder name");
		 name=br.readLine();
		
		System.out.println("Enter address");
		 address=br.readLine();
		
		System.out.println("Enter age");
		 age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Mobile");
	     mobile=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Email");;
	    email=br.readLine();
	    
	    

	}
	void deposit() throws IOException
	{
		System.out.println("Enter account holder name");
		 name=br.readLine();
		
		System.out.println("Enter account number");
		 number=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the deposit amount");
		 amount=Integer.parseInt(br.readLine());
	}
	private void withdraw() throws IOException 
	{
		System.out.println("Enter account holder name");
		 name=br.readLine();
		
		System.out.println("Enter account number");
		 number=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the withdraw amount");
		 amount1=Integer.parseInt(br.readLine());
		
	}
	private void checkBalance() throws NumberFormatException, IOException 
	{
		System.out.println("check balance");
	    balance=Integer.parseInt(br.readLine());
		
	}
	private void accounDetails() 
	{
		System.out.println("Account holder name:" +name);
		System.out.println("Account number :" +number);
		System.out.println("Deposit amount :" +amount);
		System.out.println("withdraw amount :" +amount1);
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
