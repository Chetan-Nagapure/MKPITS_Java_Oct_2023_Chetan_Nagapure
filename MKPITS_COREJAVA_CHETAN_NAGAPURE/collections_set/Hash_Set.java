package com.mkpits.collections_set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) 
	{
		Set<String> colorset=new HashSet<String>();
		System.out.println(colorset.add("Red"));
		System.out.println(colorset.add("Yellow"));
		System.out.println(colorset.add("Green"));
		System.out.println(colorset.add("Puple"));
		System.out.println(colorset.add("Red"));
		
	}

}
