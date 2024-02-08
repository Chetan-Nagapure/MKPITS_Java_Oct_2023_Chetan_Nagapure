package com.mkpits.generics;

public class PrintSum <T extends Number>
{
	//
 public void print(T []arr)
 {
	 //logic
	 
	 double sum=0;
	 for(T x : arr)
	 {
		 sum =sum + x.doubleValue();//this method is of class number so we can use it.
		 
	 }
	 System.out.println("sum = "+sum);
 }
 
// public void print(T []arr)
// {
//	 Integer  sum=0;
//	 for (T t : arr) 
//	 {
//		sum =sum + t.intValue();
//	}
//	 System.out.println("sum is" +sum);
// }
}
