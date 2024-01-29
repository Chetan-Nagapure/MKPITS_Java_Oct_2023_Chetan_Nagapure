package com.mkpits.collection.tree_map;

import java.util.TreeMap;

public class SubMapMethod 
{
	//In Java, subMap() method of TreeMap class is used to return the part or portion of the map defined by the specified range of keys in the parameter. 
	//Any changes made in one or the other map will reflect the change in the other map.

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
  
    
        // using subMap() method 
        System.out.println("The subMap is " + tree_map.subMap(10, 40)); 

	}

}
