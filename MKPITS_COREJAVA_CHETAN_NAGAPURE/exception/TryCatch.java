package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {

	public static void main(String[] args)
	{
		int[]arr=new int [5];
		int x=20, y=0;
		
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try {
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Exception");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name");
		
		try {
			String name=br.readLine();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	   }

}
