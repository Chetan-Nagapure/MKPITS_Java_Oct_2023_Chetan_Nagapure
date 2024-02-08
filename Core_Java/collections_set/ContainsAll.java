package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {

	public static void main(String[] args)
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Welcome");
		s1.add("To");
		s1.add("Java");
		s1.add("Program");
	    
		s1.forEach(System.out::println);//using lamda 
		
		Set<String> s2=new HashSet<String>();
		s2.add("This");
		s2.add("is");
		s2.add("Java");
		s2.add("Programming");
		s2.add("Language");
		
		System.out.println("Set :"+s2);
		
  
        // Check if the set contains same elements 
        System.out.println("\nDoes set 1 contains set 2?: "+ s1.containsAll(s2)); 
		

	}

}
