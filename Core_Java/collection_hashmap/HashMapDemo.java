package com.mkpits.collection_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{
  //Hash Map stores the data in (Key , Value) form and you can access them by an index of another type (e.g. an Integer).
  //One object is used as a key (index) to another object (value). 
  //If you try to insert the duplicate key in HashMap, it will replace the element of the corresponding key. 
  //Hashmap accept 16 elements.
	public static void main(String[] args) 
	{
	   // Create an empty hash map by declaring object
       // of string and integer type
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		// Adding elements to the Map
        // using standard put() method
	    map.put("Chetan", 10);
		map.put("Yash", 20);
		map.put("Ankit", 30);
		
		 // Print size and content of the Map
		System.out.println("size of map is :"+map.size());
		
		 // Checking if a key is present and if present, print value by passing random element.
		if(map.containsKey("Chetan"));
		{
			//Mapping
			Integer a=map.get("Chetan");
			
			// Printing value for the corresponding key
            System.out.println("value for key"+ " \"Chetan\" is: " + a);
		
		}
		

	}

}
