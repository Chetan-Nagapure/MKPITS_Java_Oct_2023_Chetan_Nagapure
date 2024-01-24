package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMethod {

	public static void main(String[] args) 
	{
		// creating an Set 
        Set<Integer> arr = new HashSet<Integer>();
        // using add() to initialize values 
        // [1, 2, 3, 4] 
        arr.add(10); 
        arr.add(20); 
        arr.add(30); 
        arr.add(40);
        arr.add(50);
  
        // print Set 
        System.out.println("Set: " + arr); 
  
        // Get the hashCode value 
        // using hashCode() value 
        System.out.println("HashCode value: " + arr.hashCode()); //it gives the addition of set values

	}

}
