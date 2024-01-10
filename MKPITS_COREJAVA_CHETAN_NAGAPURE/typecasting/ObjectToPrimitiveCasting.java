package com.mkpits.typecasting;

public class ObjectToPrimitiveCasting {

	public static void main(String[] args)
	{
		int x=10, y=20;
		int output=Integer.compare(x, y);
		System.out.println(output);
		
		String str1="12";
		String str2="13";
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		String input1="12.23";
		String input2="12.23";
		
		float f1=Float.parseFloat(input1);
		float f2=Float.parseFloat(input2);
						
						

	}

}
