package com.mkpits.collection;

public class PrintArray4<T> 
{
	public void print (T[] test)
	{
		for (T val : test) 
		{
			System.out.println(val);
		}
	}

	public static void main(String[] args)
	{
		Integer[] intArr = {10,20,30,40,50};
		String[] strArr = {"Chetan", "Yash", "Ankit", "Vaibhav"};
		
		PrintArray4<Integer> array1 = new PrintArray4<Integer>();
		array1.print(intArr);
		
		PrintArray4<String> array2 = new PrintArray4<String>();
		array2.print(strArr);
	}

}
