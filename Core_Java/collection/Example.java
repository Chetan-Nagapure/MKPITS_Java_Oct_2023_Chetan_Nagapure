package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) 
	{
		// Creating an object of List interface
		// implemented by the ArrayList class

		List<Integer> list1 = new ArrayList<Integer>();
		
		// Adding elements to object of List interface
		// Custom inputs
		
		list1.add(0, 1);// index 0 value is 1
		list1.add(1, 2);// index 1 value is 2
		list1.add(2, 3);// index 2 value is 3
		
		// Print the elements inside the object

		System.out.println(list1);
		
		// Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
		
		List<Integer> list2 = new ArrayList<>();//it is not necessary to write integer on that <>.
		
		// Again adding elements to object of List interface
        // Custom inputs
		
		list2.add(1);//index 0
		list2.add(2);//index 1
		list2.add(3);//index 2
		list2.add(4);//index 3
		list2.add(5);//index 4
		
		//it will add number 10 on 1st index
		//|Result = 1,10,2,3|
    	list1.add(1, 10);
	    System.out.println(list1);
	
	   //it shows the size of list1 index.
	   System.out.println(list1.size());
	
	   // Removes element from index 1
		list1.remove(1);
	
	    // Printing the updated List 1
		System.out.println(list1);
	
	    
		
		
		
		
	}

}
