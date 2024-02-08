package com.mkpits.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) 
	{
	   // Create a LinkedList of Strings
	   LinkedList<String> Fruit=new LinkedList<String>();
	  
	    Fruit.add("apple");
	    Fruit.add("banana");
	    Fruit.add("cherry");
	    Fruit.add("date");
	    Fruit.add("elderberry");
	    
	    // Printing the elements inside LinkedList
       System.out.println("LinkedList:" + Fruit);
 
        // Removing the head from List
        // using remove() method
       
        Fruit.remove();//it removes the first element from the list.
 
        // Printing the final elements inside Linkedlist
        System.out.println("Final LinkedList:" + Fruit);
        
        System.out.println("\n");
        
        //Remove (int index) method
        
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
		
	
		// Remove the head using remove()
        list.remove(4);
 
        // Print the final list
        System.out.println("Final LinkedList:" + list);
    }
	    
}


