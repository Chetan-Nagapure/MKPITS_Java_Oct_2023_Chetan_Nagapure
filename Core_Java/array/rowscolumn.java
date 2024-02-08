package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rowscolumn 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of column");
		int column=Integer.parseInt(br.readLine());
		int arr[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println();
		System.out.println("output in matrix form");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j] +" | ");
			}
			System.out.println();
		}
		

	}

}
