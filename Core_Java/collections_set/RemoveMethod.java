package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class RemoveMethod {

	public static void main(String[] args) 
	{
      Set<String> set=new HashSet<String>();
		
		// Use add() method to add elements into the Set
		set.add("This");
		set.add("is");
		set.add("Java");
		set.add("Programming");
		set.add("Language");
		set.add("This");
		
		// Displaying the Set
		System.out.println("set :"+set);
		
		// Removing elements using remove() method 
        set.remove("is"); 
        set.remove("This"); 
        
  
        // Displaying the Set after removal 
        System.out.println("Set after removing elements: " + set); 

	}

}
