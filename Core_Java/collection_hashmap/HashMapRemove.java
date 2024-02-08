package com.mkpits.collection_hashmap;

import java.util.HashMap;
import java.util.List;

public class HashMapRemove 
{
	//The java.util.HashMap.remove() is an inbuilt method of HashMap class and is used to remove the mapping of any particular key from the map. 
	//It basically removes the values for any particular key in the Map.

	public static void main(String[] args)
	{
		HashMap<Integer, String> list = new HashMap<>();
		list.put(10, "Welcome");
		list.put(20, "to");
		list.put(30, "Java");
		list.put(40, "Programming");
		list.put(50, "Language");
		
		
		System.out.println("Initial mapping :"+list);
		
		// Removing the existing key mapping
	     String s = (String)list.remove(20);
	  
	     // Verifying the returned value
	    System.out.println("Returned value is: "+ s);
	    
	    // Displaying the new map
	    System.out.println("New map is: "+ list);
	    
	}

}
