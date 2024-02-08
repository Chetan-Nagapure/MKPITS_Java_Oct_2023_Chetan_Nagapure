package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) 
	
	{
		List<String> list= new ArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("Java");
		list.add("Programming");
		list.add("Language");
		
		
		System.out.println("The list is :" +list);
		
		Iterator<String> iterator= list.iterator();
		
		System.out.println(" \n the iterator Values of list are :" );
		
		while (iterator.hasNext()) 
			
		{
			System.out.println(iterator.next());
		}
		
			
		}
		
	}


