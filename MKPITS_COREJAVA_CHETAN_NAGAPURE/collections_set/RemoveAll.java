package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class RemoveAll {

	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Welcome");
		s1.add("To");
		s1.add("Java");
		s1.add("Program");
	    
		s1.forEach(System.out::println);//using lamda 
		
		System.out.println();
		
		Set<String> s2=new HashSet<String>();
		s2.add("This");
		s2.add("is");
		s2.add("Java");
		s2.add("Programming");
		s2.add("Language");
		
		s2.forEach(System.out::println);
		
		 // Removing elements from set 
        // specified in set2 
        // using removeAll() method 
        s1.removeAll(s2); 
		
        // print set1 
        System.out.println("Set after removeAll() operation : "+ s1); 

	}

}
