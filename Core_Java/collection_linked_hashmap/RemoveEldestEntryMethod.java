package com.mkpits.collection_linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class RemoveEldestEntryMethod 
{
	protected static final int Max = 6;

	//The java.util.LinkedHashMap.removeEldestEntry() method in Java is used keep a track of whether the map removes any eldest entry from the map. 
	//So each time a new element is added to the LinkedHashMap, the eldest entry is removed from the map. 
	//This method is generally invoked after the addition of the elements into the map by the use of put() and putall() method.

	public static void main(String[] args) 
	{
		
		 LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>() 
		 {
			 protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
			            
			 {
			     return size() > Max;
			            
			 }
			       
		 };
			        
			        // Adding elements using put()
			        lhm.put(0, "Welcome");
			        lhm.put(1, "To");
			        lhm.put(2, "The");
			        lhm.put(3, "World");
			        lhm.put(4, "Of");
			        lhm.put(5, "Java");
			        
			        System.out.println("" + lhm);
			        
			        // Adding more elements
			        lhm.put(6, "Programming");
			 
			        // Displaying the map after adding one more element
			        System.out.println("" + lhm);
			 
			        // Adding more elements
			        lhm.put(7, "Language");
			 
			        // Displaying the map after adding one more element
			        System.out.println("" + lhm);
			        
			        
			 
		
	}

}
