package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class GetMethod {

	public static void main(String[] args) 
	{
    List<Integer> list1 = new ArrayList<>();//it is not necessary to write integer on that <>.
		
		// Again adding elements to object of List interface
        // Custom inputs
		
		list1.add(1);//index 0
		list1.add(2);//index 1
		list1.add(3);//index 2
		list1.add(4);//index 3
		list1.add(5);//index 4
		
		// Prints element at index 1 in list 1
	    // using get() method
	    System.out.println(list1.get(1));
		 

	}

}
