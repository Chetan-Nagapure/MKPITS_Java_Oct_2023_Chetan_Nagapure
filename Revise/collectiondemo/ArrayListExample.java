package com.mkpits.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrlist =new ArrayList<Integer>(5);
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		
		arrlist.add(4,50);
		
	 for (Integer number : arrlist)
	 {
		System.out.println("Number: " + number);
	}
	 
	}

}
