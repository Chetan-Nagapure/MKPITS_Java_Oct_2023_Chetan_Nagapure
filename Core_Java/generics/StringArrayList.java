package com.mkpits.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {

	public static void main(String[] args) 
	{
		List<String> nameList= new ArrayList<String>();
		nameList.add("Chetan");
		nameList.add("Yash");
		nameList.add("Ankit");
		nameList.add("Vaibhav");
		
		
		//1st way
		for(int i=0; i<nameList.size() ; i++)
		{
			System.out.println(nameList.get(i));
		}
		
		
		//2nd way
//		System.out.println("Using iterator");
//		for (Iterator iterator = nameList.iterator(); 
//			iterator.hasNext();) 
//		{
//			String name = (String) iterator.next();
//			System.out.println(name);
//		}
		
		
		//3rd way
//		for(String name : nameList)
//		{
//			System.out.println(name);
//		}

	}
}


