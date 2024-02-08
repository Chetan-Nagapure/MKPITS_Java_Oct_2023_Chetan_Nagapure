package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AddMethod {

	public static void main(String[] args) 
	{
		// Creating an object of List interface,
		// implemented by ArrayList class
		
		List<String> a =new ArrayList<>();
		
		// Adding elements to object of List interface
	    // Custom elements
		
		a.add("Java");     //index 0
		a.add("Language"); //index 1
		//a.add(1,"-");  //it will add "-" on index 1 and index 1 value i,e "language" show after index 1 i,e "-".    
		
		
		//| Result = Java,-,language |
		//System.out.println(a);
		
		StringJoiner join=new StringJoiner("-");
		join.add(a.get(0)).add(a.get(1));
		
		//it will join the index0 and index1 value.
		// |Result = Java-language|
		System.out.println(join);
		
		//it will check the contains whether it is true or false.
		System.out.println(a.contains("Java")); // true
		
		
		}

}
