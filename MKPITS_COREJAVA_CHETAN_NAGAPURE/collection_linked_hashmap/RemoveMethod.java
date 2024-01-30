package com.mkpits.collection_linked_hashmap;

import java.util.LinkedHashMap;

public class RemoveMethod 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
	    hm.put(4, "This"); 
	    hm.put(3, "is"); 
	    hm.put(2, "java"); 
	    hm.put(1, "Programming"); 

	   
	    System.out.println("Initial map : " + hm); 
	    
	    // Removing the mapping with Key 4 
        hm.remove(1); 
  
        // Printing the updated map 
        System.out.println("Updated Map : " + hm); 
   
	} 

}


