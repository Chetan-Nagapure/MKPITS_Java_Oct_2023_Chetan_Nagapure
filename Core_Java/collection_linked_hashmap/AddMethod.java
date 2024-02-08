package com.mkpits.collection_linked_hashmap;

import java.util.LinkedHashMap;

public class AddMethod 
{
	//In order to add an element to the LinkedHashMap, we can use the put() method. 
	//This is different from HashMap because in HashMap, the insertion order is not retained but it is retained in the LinkedHashMap. 

	public static void main(String[] args) 
	{
		 LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>(); 

     // Add mappings to Map 
     // using put() method 
     hm1.put(3, "This"); 
     hm1.put(2, "is"); 
     hm1.put(1, "Java"); 

     // Printing mappings to the console 
     System.out.println("Mappings of LinkedHashMap : "+ hm1); 
	
	}

}
