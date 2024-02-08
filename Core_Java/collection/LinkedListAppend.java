package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListAppend
//Append - to add a elements in a particular index of list from another list.
{

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("this"); //index 0
		list.add("is");//index 1
		list.add("Code");//index 2
		list.add("10");//index 3
		list.add("20");//index 4
		
		System.out.println("The list is :"+list);
		
		// A collection list is created 
		Collection<String> collect=new ArrayList<String>();
		collect.add("A");
		collect.add("computer");
		collect.add("portal");
		collect.add("of");
		collect.add("Java");
		
		// Displaying the list 
	      System.out.println("The LinkedList is: " + list); 
	              
	      // Appending the collection to the list 
	      list.addAll(2, collect); 
	  
	    //The new linked list after appending
	     System.out.println("The new linked list is: " + list);
		
	}

}
