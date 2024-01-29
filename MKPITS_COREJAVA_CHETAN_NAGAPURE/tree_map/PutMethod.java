package com.mkpits.collection.tree_map;

import java.util.TreeMap;

public class PutMethod 
{
	//The java.util.TreeMap.put() method of TreeMap is used to insert a mapping into a map. 
	//This means we can insert a specific key and the value it is mapping to into a particular map. 
	//If an existing key is passed then the previous value gets replaced by the new value. 
	//If a new pair is passed, then the pair gets inserted as a whole.

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
		  
        // Mapping string values to int keys 
        tree_map.put(10, "This"); 
        tree_map.put(20, "is"); 
        tree_map.put(30, "java"); 
        tree_map.put(40, "programming"); 
        tree_map.put(50, "language"); 
  
        // Displaying the TreeMap 
        System.out.println("Initial Mappings are: " + tree_map); 
  
        // Inserting existing key along with new value 
        String returned_value = (String)tree_map.put(20, "for");
  
        // Verifying the returned value 
        System.out.println("Returned value is: " + returned_value); 
  
        // Displaying the new map 
        System.out.println("New map is: " + tree_map);
        
        
	}

}
