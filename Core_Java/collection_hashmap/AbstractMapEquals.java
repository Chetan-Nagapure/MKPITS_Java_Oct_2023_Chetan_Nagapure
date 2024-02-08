package com.mkpits.collection_hashmap;

import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.List;

public class AbstractMapEquals 
{

	//The AbstractMap.equals() method in Java is used to check for equality between two maps. 
	//It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
	public static void main(String[] args) 
	{
		
		AbstractMap<Integer, String> list=new IdentityHashMap<Integer, String>();
		list.put(10, "Welcome");
		list.put(20, "to");
		list.put(30, "Java");
		list.put(40, "Programming");
		list.put(50, "Language");
		
		System.out.println("Initial mapping :"+list);
		
		AbstractMap<Integer, String> list2=new IdentityHashMap<Integer, String>();
		list2.put(10, "Welcome");
		list2.put(20, "to");
		list2.put(30, "Java");
		list2.put(40, "Programming");
		list2.put(50, "Language");
		
		System.out.println("Initial mapping :"+list2);
		
		// Displaying the equality 
        System.out.println("Equality: " + list.equals(list2)); 
    
	}

}
