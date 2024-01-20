package com.mkpits.collection;

import java.util.LinkedList;

public class LinkedListAddLast {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("This");
		list.add("is");
		list.add("Java");
		
		System.out.println("The list is:"+list);
		
		 // Adding new elements at the end of list using addLast
		
		list.addLast("Programming");
		list.addLast("Language");
		
		//Print the new list
		System.out.println("the new list is :"+list);
	}

}
