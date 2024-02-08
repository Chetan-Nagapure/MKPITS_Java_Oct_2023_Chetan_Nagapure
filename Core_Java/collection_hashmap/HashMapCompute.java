package com.mkpits.collection_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCompute 
{

	//The compute(Key, BiFunction) method of HashMap class allows you to update a value in HashMap. 
	//The compute() method tries to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping is found).
	//This method is used to automatically update a value for given key in HashMap.
	
	public static void main(String[] args) 
	{
	  
	  HashMap<String, String> str=new HashMap<String, String>();
	  str.put("Name", "Java");
	  str.put("Language", "Java Programming");
	  
	 //using for each
	  for (Map.Entry<String, String> entry : str.entrySet()) 
	  {
		String key = entry.getKey();
		String val = entry.getValue();
		System.out.println("Key :"+ key  +"value :"+ val);
	
	  }
	 
	  //using lambda expression 
	  str.keySet().forEach(s -> System.out.println(s));
	  str.values().forEach(s -> System.out.println(s));
	  
      //Remap the values using compute() method 
      str.compute("Name", (key, val) -> val.concat(" Program")); 
      str.compute("Language", (key, val)-> val.concat(" Language")); 
	  
      // print new mapping 
      System.out.println("New Map: " + str); 
	  
	}

}
