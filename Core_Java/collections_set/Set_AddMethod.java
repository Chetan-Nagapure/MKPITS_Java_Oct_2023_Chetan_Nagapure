package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class Set_AddMethod {

	public static void main(String[] args) 
	{
		// Creating an empty Set
		Set<String> set=new HashSet<String>();
		
		// Use add() method to add elements into the Set
		set.add("This");
		set.add("is");
		set.add("Java");
		set.add("Programming");
		set.add("Language");
		set.add("This");
		
		// Displaying the Set
		System.out.println("set :"+set);//
		
		Set<Integer> i =new HashSet<Integer>();
		i.add(1);
		i.add(3);
		i.add(5);
		i.add(2);
		i.add(6);
		i.add(4);
		i.add(7);
		
		System.out.println("set :"+i);//if we take single digit at random then value gives in ascending order.
		
		//i.forEach(System.out::println);
		
		
		Set<Integer> s= new HashSet<Integer>();
		s.add(22);
		s.add(41);
		s.add(14);
		s.add(53);
		s.add(32);
		
		System.out.println("set :"+s);//if we take two digit number at random then valur gives randomly. 
		
	}

}
