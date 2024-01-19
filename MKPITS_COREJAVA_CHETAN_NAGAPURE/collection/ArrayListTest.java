package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) 
	{
		// Non Generic Version
		//in non generic we have to create object to access data of various data type.
		
		ArrayList list=new ArrayList ();
		list.add(1);
		list.add("Nagpur");
		list.add(12.5);
		list.add(10.2f);
		list.add(true);
		
		
		for (Object object : list)
		{
			System.out.println(object);
		}
		
		//Generic version  with type safety
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(1);
//		intArr.add(12.5);
//		intArr.add(10.5f);
//		intArr.add("Nagpur");
//		intArr.add(true);
	}

}
