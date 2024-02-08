package com.mkpits.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PollMethod 
{
 //This method remove randomly element.
	public static void main(String[] args) 
	{

		Queue<String> p=new PriorityQueue<String>();
        p.add("This");
        p.add("is");
        p.add("java");
        p.add("Language");
 
        System.out.println("Initial Queue " + p);
	        
	    System.out.println("Poll Method " + p.poll());
	   	 
	    System.out.println("Final Queue " + p);
	 

	}

}
