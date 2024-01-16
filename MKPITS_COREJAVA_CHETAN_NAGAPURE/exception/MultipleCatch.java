package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleCatch {

	public static void main(String[] args) 
	{
		int []arr=new int [5];
		int x=10, y=0;
		
		try
		{
			System.out.println(arr[3]);
			System.out.println(x/y);
		}catch(ArrayIndexOutOfBoundsException  | ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Name");
		
		try {
			String name=br.readLine();
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			System.out.println("Connection close");
		}
		

	}

}
