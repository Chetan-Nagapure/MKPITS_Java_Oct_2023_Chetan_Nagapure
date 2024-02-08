package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleInheritance {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ChildClass c=new ChildClass();

	    System.out.println("Enter Your First Name :");
		String fname=br.readLine();
	    c.getFirstName(fname);
	    
	    System.out.println("Enter Your Last Name :");
		String lname=br.readLine();
	    c.getLastName(lname);
	    
	    System.out.println("Enter Your Email :");
		String email=br.readLine();
	    c.getEmail(email);
	    
	    System.out.println("Enter Your Mobile Number :");
		long mobile=Long.parseLong(br.readLine());
	    c.getMobile(mobile);
	    
	    System.out.println("Enter Your Gender :");
		char gender=(char) br.read();
		br.readLine();
		c.getGender(gender);
		
		 
	    System.out.println("Enter Your Pincode :");
		int pincode=Integer.parseInt(br.readLine());
		c.getPincode(pincode);
		
		c.getAllDetails();
		
		    
	    
	    
	    
	    
	    
	    
	}

}
