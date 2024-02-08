package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class ContainsMethod {

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
		
		System.out.println("Set :"+set);
		
		System.out.println(set.contains("is"));//it gives true if element is present else false.

		System.out.println(set.contains("to"));//false
	}

}
