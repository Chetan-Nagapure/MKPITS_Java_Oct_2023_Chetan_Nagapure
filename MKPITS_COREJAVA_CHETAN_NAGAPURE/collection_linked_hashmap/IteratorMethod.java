package com.mkpits.collection_linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratorMethod 
{
	//The most famous way is to use a for-each loop over the set view of the map (fetched using map.entrySet() instance method).
	//then for each entry (set element) the values of key and value can be fetched using the getKey() and the getValue() method.

	public static void main(String[] args) 
	{
LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
	    hm.put(4, "This"); 
	    hm.put(3, "is"); 
	    hm.put(2, "java"); 
	    hm.put(1, "Programming"); 

	   
	    System.out.println("Initial map : " + hm);
	    
	    for (Map.Entry<Integer, String> mapelement : hm.entrySet()) 
	    {
			Integer key = mapelement.getKey();
			String val = mapelement.getValue();
			
			System.out.println(key + " : " + val);
			
		}
	}

}
