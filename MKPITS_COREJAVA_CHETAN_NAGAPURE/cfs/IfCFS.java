package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfCFS 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter UserName");
		String UserName=br.readLine();
		
		System.out.println("Password");
		String Password=br.readLine();
		
		if(UserName.equals(""))
		{
			System.out.println("UserName Required");
		}
		if(Password.equals(""))
		{
			System.out.println("Password Required");
		}
		if(UserName.equals("Chetan") || UserName.equals("Chetan") && Password.equals("chetan@123"))
		System.out.println("Login Successfully..........");
	}
}
		

	


