package com.mkpits.methods;

public class MethodsWithReturnTypeWithArgument 
{

	public static void main(String[] args) 
	{
      MethodsWithReturnTypeWithArgument m= new MethodsWithReturnTypeWithArgument();
      int add= m.getdetails(20, 40);
      System.out.println(add);

	}
	
	//return method which return some values so give us datatype
	public int getdetails(int a, int b)
	
	{
		int c=a + b;
		return c;
		
	}

}
