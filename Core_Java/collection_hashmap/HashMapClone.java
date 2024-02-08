package com.mkpits.collection_hashmap;

import java.util.HashMap;

public class HashMapClone 
{

	//The java.util.HashMap.clone() method is present inside java.util package which typically is used to return a shallow copy of the mentioned hash map. 
	//It just creates a copy of the map.
	
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> list = new HashMap<>();
		list.put(10, "Welcome");
		list.put(20, "to");
		list.put(30, "Java");
		list.put(40, "Programming");
		list.put(50, "Language");
		
		
		System.out.println("Initial mapping :"+list);
		
		// Print and display the cloned HashMap 
        // using clone() method 
        System.out.println("The cloned map look like this: "+ list.clone()); 
        
	}

}
