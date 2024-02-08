package com.mkpits.collection_hashmap;

import java.util.HashMap;

public class HashMapClear 
{
	//The java.util.HashMap.clear() method in Java is used to clear and remove all of the elements or mappings from a specified HashMap.

	public static void main(String[] args) 
	{
		HashMap<Integer, String> list = new HashMap<>();
		list.put(10, "Welcome");
		list.put(20, "to");
		list.put(30, "Java");
		list.put(40, "Programming");
		list.put(50, "Language");
		
		
		System.out.println("Initial mapping :"+list);
		
		// Clearing the hash map using clear() 
        list.clear(); 
  
        // Displaying the final HashMap 
        System.out.println("Finally the maps look like this: " + list); 
    } 

	}


