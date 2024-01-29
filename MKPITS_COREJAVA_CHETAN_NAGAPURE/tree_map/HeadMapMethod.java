package com.mkpits.collection.tree_map;

import java.util.SortedMap;
import java.util.TreeMap;

public class HeadMapMethod 
{
	//The java.util.TreeMap.headMap(key_point) method of TreeMap class is used to get all the pairs or portion of the map strictly less than the parameter key_value. 
	//The mentioned parameter is excluded from the newly prepared treemap. 
	//Since the set is backed by the map, so any changes to the map are reflected in the other map, and vice-versa.


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
        
        // Creating the sorted map for map head 
        SortedMap<Integer, String> map_head = new TreeMap<Integer, String>(); 
        map_head = tree_map.headMap(40); 
  
        // Getting the map head 
        System.out.println("The headmap is: " + map_head); 
    
 
	}

}
