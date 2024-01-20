package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAddAll {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("this");
		list.add("is");
		list.add("Java");
		list.add("10");
		list.add("20");
		
		System.out.println("The list is :"+list);
		
		// A collection is created 
		Collection<String> collect=new ArrayList<String>();
		list.add("Programming");
		list.add("language");
		
		// Appending the collection to the list 
	      list.addAll(collect); 
	  
	     // Clearing the list using clear() and displaying 
	     System.out.println("The new linked list is: " + list); 
	  
	}

}
