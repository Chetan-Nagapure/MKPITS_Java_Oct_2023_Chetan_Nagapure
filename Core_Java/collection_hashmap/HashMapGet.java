package com.mkpits.collection_hashmap;

import java.util.HashMap;

public class HashMapGet 
{
	//The java.util.HashMap.get() method of HashMap class is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. 
	//It returns NULL when the map contains no such mapping for the key.

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		HashMap<Integer, String> list = new HashMap<>();
		list.put(10, "Welcome");
		list.put(20, "to");
		list.put(30, "Java");
		list.put(40, "Programming");
		list.put(50, "Language");
		
		System.out.println("Initial mapping :"+list);
		
	  // Getting the value of 30 
        System.out.println("The Value is: " + list.get(30)); 
        
      // Getting the value of 10 
        System.out.println("The Value is: " + list.get(10)); 
		
        
        HashMap<String, Integer> list1 = new HashMap<>();
		list1.put("Welcome",10);
		list1.put("to", 20);
		list1.put("Java", 30);
		list1.put("Programming", 40);
		list1.put("Language", 50);
		
		System.out.println("Initial mapping :"+list1);
		
	  // Getting the value of Java 
        System.out.println("The Value is: " + list1.get("Java")); 
        
      // Getting the value of Welcome 
        System.out.println("The Value is: " + list1.get("Welcome")); 
		
	}

}
