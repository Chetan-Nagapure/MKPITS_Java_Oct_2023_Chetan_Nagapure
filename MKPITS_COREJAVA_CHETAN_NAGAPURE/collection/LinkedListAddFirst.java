package com.mkpits.collection;

import java.util.LinkedList;

public class LinkedListAddFirst {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("This");
		list.add("is");
		list.add("Java");
		list.add("10");
		list.add("20");
		
		
		System.out.println("The list is :"+list);
		
	    // Adding new elements at the beginning 
		
		list.addFirst("Programming");
		list.addFirst("language");
		
		//Displaying the new list
		
		System.out.println("The new list :" +list);
		
		
		
		

	}

}
