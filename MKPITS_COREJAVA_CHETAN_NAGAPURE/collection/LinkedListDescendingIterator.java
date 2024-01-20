package com.mkpits.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDescendingIterator 
{

	public static void main(String[] args) 
	{
	  
	 try
	 {
	  LinkedList<Integer> list= new LinkedList<Integer>();
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  
	  System.out.println("The list is :"+list);
	  
	// set Iterator as descending 
    // using descendingIterator() method
	  
	  Iterator itr=list.descendingIterator();
	  
	// print list with descending order 
	  while (itr.hasNext()) 
	  {
	     Integer i = (Integer) itr.next();
	     System.out.println(i);
	
	  }
	 
	 } catch(Exception e)
	  {
		  e.printStackTrace();
		  
	  }
	 
	}
}
	
	  
	  
	  
	  
	  
	  
	  
	  
	
	  
	  
	