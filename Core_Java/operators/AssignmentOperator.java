package com.mkpits.operators;

public class AssignmentOperator {

	public static void main(String[] args)
	{
		getAssign();

	}
	private static void getAssign()
	{
		int a=10, b=20;
		int add=(a+=b);
		int sub=(a-=b);
		int mul=(a*=b);
		int div=(a/=b);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}

}
