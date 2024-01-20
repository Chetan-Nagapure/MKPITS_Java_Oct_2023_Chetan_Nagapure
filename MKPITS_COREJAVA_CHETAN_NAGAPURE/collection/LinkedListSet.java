package com.mkpits.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSet {

	public static void main(String[] args)
	{
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		// Print the list
		System.out.println("The list is :" + list);
		
		//using set() method to replace 20 with 200
		
		list.set(1, 200);
		System.out.println("The updated list is :" +list);
		
		list.set(4, 500);
		System.out.println("The updated list is :" +list);//Replace index 4 value with 500.
		
	}

}
