package com.mkpits.array;

public class Matharray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Matharray demo=new Matharray();
		demo.mathMethod();

	}
	private void mathMethod()
	{
		System.out.println(Math.cbrt(2));//double
		System.out.println(Math.addExact(12, 21));//int
		System.out.println(Math.abs(1));//int
		System.out.println(Math.ceil(10));//double
		System.out.println(Math.max(12, 20));//int
		System.out.println(Math.min(11, 12));//int
		System.out.println(Math.multiplyExact(12, 12));//int
		System.out.println(Math.random());//double
		System.out.println(Math.subtractExact(123, 213));//int
		System.out.println(Math.abs(4));//int
		System.out.println(Math.pow(12.0, 21.2));//double
		System.out.println(Math.max(12.11, 2.22));//double
		System.out.println(Math.min(12345, 54321));
		
		
	}

}
