package com.mkpits.collection_linked_hashmap;

import java.util.LinkedHashMap;

public class UpdateMethod
{
	//After adding elements if we wish to change the element, it can be done by again adding the element using the put() method. 
	//Since the elements in the LinkedHashMap are indexed using the keys, the value of the key can be changed by simply re-inserting the updated value for the key for which we wish to change.

	public static void main(String[] args) 
  {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>(); 

    hm.put(4, "This"); 
    hm.put(3, "is"); 
    hm.put(2, "java"); 
    hm.put(1, "Programming"); 

    // Printing mappings to the console 
    System.out.println("Initial map : " + hm); 

    // Updating the value with key 1 
    hm.put(1, "Program"); 

    // Printing the updated Map 
    System.out.println("Updated Map : " + hm); 

	}

}
