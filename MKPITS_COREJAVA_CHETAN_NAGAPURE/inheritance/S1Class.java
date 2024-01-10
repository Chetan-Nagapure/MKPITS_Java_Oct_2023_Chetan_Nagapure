package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1Class {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	C1class c=new C1class();
	
	System.out.println("Enter your first name :");
	String fname=br.readLine();
	
	System.out.println("Enter your last name :");
	String lname=br.readLine();
	
	System.out.println("Enter Email :");
	String email=br.readLine();
	
	System.out.println("Enter mobile :");
	long mobile=Long.parseLong(br.readLine());
	
	System.out.println("Enter gender :");
	char gender=(char) br.read();
	br.readLine();
	
	System.out.println("Enter age :");
	int age=Integer.parseInt(br.readLine());
	
	
	c.setDetail(fname, lname, email);
    c.getDetail(mobile, gender, age);
	c.getAllDetails();
	}

}
