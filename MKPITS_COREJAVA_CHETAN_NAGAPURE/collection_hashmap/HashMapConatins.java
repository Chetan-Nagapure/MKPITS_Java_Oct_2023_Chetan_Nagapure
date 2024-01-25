package com.mkpits.collection_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConatins 
{
//ContainsValue HashMap
	public static void main(String[] args) 
	{
		HashMap<Integer, String> list=new HashMap<Integer, String>();
		list.put(1, "This");
		list.put(2, "Is");
		list.put(3, "Java");
		
		System.out.println("Initial map is :"+list);
		
//		for (Entry<Integer, String> entry : list.entrySet()) 
//		{
//			System.out.println(" key : "+ entry.getKey() + "val :"+ entry.getValue());
//		}
		
		for (Map.Entry<Integer, String> entry : list.entrySet()) 
		{
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(" key : "+ key + "  val : "+ val);
			
		}
		
		//it print only keys.
		var keySet=list.keySet();
		for(var key : keySet)
		{
			System.out.println(key);
		}
		
		//it print only values.
		var values=list.values();
		for(var v : values)
		{
			System.out.println(v);
		}
		
		
		//it will check weather the element is present or not , if present then it True otherwise false.
		// Checking for the key_element '20'
       
		System.out.println("Is the key '20' present? " + list.containsKey(20));
        
        System.out.println("Is the key '2' present? " + list.containsKey(2));
		
	}

}
