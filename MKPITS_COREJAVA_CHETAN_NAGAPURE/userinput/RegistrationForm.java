package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationForm
{

String firstName,lastName,email,gender,passward;
long mobile;
int age;



	public static void main(String[] args) throws IOException 
	{
		RegistrationForm registration=new RegistrationForm();
		registration.register();
		
		
		System.out.println("FirstName:"+registration.firstName);
		System.out.println("lastName:"+registration.lastName);
		System.out.println("email:"+registration.email);
		System.out.println("gender:"+registration.gender);
		System.out.println("passward:"+registration.passward);
	    System.out.println("mobile:"+registration.mobile);
	    System.out.println("age:"+registration.age);
	}
	public void register() throws IOException 
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first Name");
		this.firstName=reader.readLine();
		
		System.out.println("Enter last Name");
		this.lastName=reader.readLine();
		
		System.out.println("Enter email");
		this.email=reader.readLine();
		
		System.out.println("Enter gender");
		this.gender=reader.readLine();
		
		System.out.println("Enter passward");
		this.passward=reader.readLine();
		
		System.out.println("Enter mobile");
		this.mobile=Long.parseLong(reader.readLine());
		
		System.out.println("Enter age");
		this.age=Integer.parseInt(reader.readLine());
			
	}

}
