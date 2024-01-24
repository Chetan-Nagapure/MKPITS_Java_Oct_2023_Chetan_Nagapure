package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class RetainAll {

	public static void main(String[] args)
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Welcome");
		s1.add("To");
		s1.add("Java");
		s1.add("Program");
		
		System.out.println("Set :"+s1);
		
		
		Set<String> s2=new HashSet<String>();
		s2.add("This");
		s2.add("is");
		s2.add("Java");
		s2.add("Programming");
		s2.add("Language");
		
		System.out.println("Set :"+s2);
		
		// Removing elements from set 
        // specified in set2 
        // using retainAll() method 
        s1.retainAll(s2); 

        // print arrset1 
        System.out.println("Set after retainAll() operation : "+ s1);//it print the duplicate element from set.

	}

}
