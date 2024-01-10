package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescendingOrder 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 number");
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}



//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println();

		System.out.println("Descending sorting...........");

		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
							
				}
			}
		}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
	}

}
