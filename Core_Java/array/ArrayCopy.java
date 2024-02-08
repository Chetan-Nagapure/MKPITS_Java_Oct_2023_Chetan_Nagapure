package com.mkpits.array;

public class ArrayCopy {

	public static void main(String[] args)
	{
		String [] copyFrom= {"Chetan","yash","saurabh","sumit","Ankit","Vaibhav","Raj","Vinay","Harsh","Pranav","Kaushik","Shreyash"};
		
		String [] copyTo=new String[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		for(String name : copyTo)
		{
			System.out.println(name + " ");
		}
		
		
		
	}

}
