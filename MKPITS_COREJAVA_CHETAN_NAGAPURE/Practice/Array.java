package com.mkpits.Practice;

public class Array {

	public static void main(String[] args) 
	{
		multidimentional();

	}
	public static void multidimentional()
	{
		int arr[][]= {{123},{456},{789}};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
