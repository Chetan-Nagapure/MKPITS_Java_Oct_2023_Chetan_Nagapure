package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		int sum=0;
		 
		for(int a=1;a<=no;a++)
		{
			sum=sum+a;
			
		}
		System.out.println(sum);

	}

}
