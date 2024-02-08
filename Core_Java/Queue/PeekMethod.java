package com.mkpits.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PeekMethod 
{
  //Print the top element from  the PriorityQueue.
	public static void main(String[] args) 
	{
		Queue<String> p=new PriorityQueue<>();
        p.add("This");
        p.add("is");
        p.add("java");
        p.add("Language");
 
        System.out.println("Initial Queue " + p);
	        
	    System.out.println("Peek Method " + p.peek());
	   	 
	    System.out.println("Final Queue " + p);

	}

}
