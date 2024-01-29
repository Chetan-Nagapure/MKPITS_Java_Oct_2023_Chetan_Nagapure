package com.mkpits.collection.tree_map;

import java.util.TreeMap;

public class FirstEntryAndFirstKeyMethod 
{
	//First Key
	//It returns the first (lowest) key currently in the map. 

	public static void main(String[] args) 
	{
      TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		 
      treemap.put(2, "two"); 
      treemap.put(1, "one"); 
      treemap.put(3, "three"); 
      treemap.put(6, "six"); 
      treemap.put(5, "five"); 
      treemap.put(9, "nine"); 

      // Printing the lowest entry in TreeMap by using firstKey() method. 
      System.out.println("Lowest key is: " + treemap.firstKey()); 
      
      //FirstEntry
      //
      
      TreeMap<Integer, String> t = new TreeMap<Integer, String>(); 

      // Populating the time taken to complete task 
      // using put() method 
      t.put(1, "This"); 
      t.put(2, "is"); 
      t.put(3, "java"); 
      t.put(4, "programming"); 
      t.put(5, "language"); 

  
  // using of firstEntry() method 
  System.out.println(" Entry: "
                     + t.firstEntry()); 

	}

}
