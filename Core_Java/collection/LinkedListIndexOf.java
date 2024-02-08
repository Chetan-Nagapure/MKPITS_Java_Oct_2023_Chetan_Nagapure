package com.mkpits.collection;

import java.util.LinkedList;

public class LinkedListIndexOf {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    
	    //print the list
	    System.out.println("The list is :"+list);
	    
	    // The first position of an element is returned
	    
	    System.out.println("The first occurrence of 20 is at index:"+list.indexOf(20));
	     
	    System.out.println("The first occurrence of 10 is at index: " + list.indexOf(10)); 
	  
	}

}
