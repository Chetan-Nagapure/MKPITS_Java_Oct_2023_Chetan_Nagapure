package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
	
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//1
		int arr[][]= {{1,23},{2,24},{3,25},{4,26}};
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println(arr[i][j]);
		}
	}
	
	System.out.println();
	
	//2
	String [][]name= {{"Mrs.","Ms.","Mr."},{"chetan","yash","akash"}};
	System.out.println(name[0][0]+" " +name[1][0]);
	System.out.println(name[0][1]+" " +name[1][1]);
	System.out.println(name[0][2]+" " +name[1][2]);
	
	//3
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of rows");
	int row=Integer.parseInt(br.readLine());
	System.out.println("Enter the number of column");
	int column=Integer.parseInt(br.readLine());
	int arr1[][]=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			arr1[i][j]=Integer.parseInt(br.readLine());
		}
	}
	
    }
}

	


