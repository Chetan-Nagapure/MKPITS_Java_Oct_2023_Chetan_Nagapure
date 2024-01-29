package com.mkpits.collection.tree_map;

import java.util.TreeMap;

public class PutAllMethod
{
	//The java.util.TreeMap.putAll() is an inbuilt method of TreeMap class that is used for the copy operation. 
	//The method copies all of the elements i.e., the mappings, from one map into another.

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
		  
        // Mapping string values to integer keys 
        tree_map.put(10, "This"); 
        tree_map.put(20, "is"); 
        tree_map.put(30, "java"); 
        tree_map.put(40, "programming"); 
        tree_map.put(50, "language"); 
  
        // Displaying the TreeMap 
        System.out.println("Initial Mappings are: " + tree_map); 
        
        // Creating a new tree map and copying 
        TreeMap<Integer, String> new_tree_map = new TreeMap<Integer, String>(); 
        
        new_tree_map.putAll(tree_map); 
  
        // Displaying the final TreeMap 
        System.out.println("The new map looks like this: "+ new_tree_map); 
	}

}
