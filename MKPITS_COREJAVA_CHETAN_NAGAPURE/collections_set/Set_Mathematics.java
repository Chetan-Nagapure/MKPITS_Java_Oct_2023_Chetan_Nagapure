package com.mkpits.collections_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Mathematics {

	public static void main(String[] args) 
	{
		Set<Integer> s1 = new HashSet<Integer>();
		s1.addAll(Arrays.asList(new Integer[] { 10,20,30,40,50,60,70,80,90,0 }));
		System.out.println("Set1 is :"+s1);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(Arrays.asList(new Integer[] { 20,50,80,50,10,30,60,70}));
		System.out.println("Set2 is :"+s2);

		// To find union ----- print all elements and remove duplicate elements
		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection ----print common Elements
		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.print("Difference of the two Set");
		System.out.println(difference);

		

	}

}
