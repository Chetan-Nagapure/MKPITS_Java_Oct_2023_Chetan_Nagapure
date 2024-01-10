package com.mkpits.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibbonacciSeries 
{
// 1 1 2 3 5 8 13 21...
	public static void main(String[] args) throws  IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n1=1;
		int n2=1;
		System.out.println(+n1);
		for(int n=1;n<20;n++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
			
		}
       
	}

}
