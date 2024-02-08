package com.mkpits.looping;

public class Nestedloop 
{

	public static void main(String[] args)
	{
		//pattern 1
		
		int rows=5;
		
		//outer loop
		for (int i=1; i<=rows;++i )
		{
	     //inner loop to print the number
			for(int j=1; j<=i; ++j)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		{
			for(int i=1; i<=5; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
	}

}
