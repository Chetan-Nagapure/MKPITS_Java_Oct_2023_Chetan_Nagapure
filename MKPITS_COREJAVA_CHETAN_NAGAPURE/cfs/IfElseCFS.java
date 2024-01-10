package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseCFS {

	public static void main(String[] args) throws IOException 
	
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter UserName");
		String UserName=br.readLine();
		
		System.out.println("Enter Password");
		String Password=br.readLine();
		
		if(UserName.equals("Chetan"))
				{
			if(Password.equals("chetan@123"))
			{
				System.out.println("Login Successfully");
			}
			else
			{
				System.out.println("Login Failed");
			}
				
	
				}
	}
}