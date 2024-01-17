package com.mkpits.generics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTestBuffered 
{

	public static void main(String[] args) 
	{
		List<String> names= new ArrayList<String>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		
		try
		{
			int size=Integer.parseInt(br.readLine());
			for(int i=0; i< size; i++)
			{
				System.out.println("enter the name ");
				String n=br.readLine();
				names.add(n);
		     }
		}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		for(String name : names)
		{
			System.out.println(name);
		}

	}
}
			

		
		
		

	


