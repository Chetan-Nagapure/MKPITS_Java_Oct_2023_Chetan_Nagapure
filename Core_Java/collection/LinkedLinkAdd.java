package com.mkpits.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedLinkAdd {

	public static void main(String[] args) 
	{
		// Adding elements in the list 
        // using add() method 
		LinkedList<String> list=new LinkedList<String>();
		list.add("This");
		list.add("is");
		list.add("Java");
		list.add("10");
		list.add("20");
		
		System.out.println("The list is :"+list);
		
		// Adding new elements to the end 
        // Note: Default addition happens from last 
		list.add("Programming");
		list.add("language");
		
		System.out.println("The updated list is :"+list);
		
	}

}
