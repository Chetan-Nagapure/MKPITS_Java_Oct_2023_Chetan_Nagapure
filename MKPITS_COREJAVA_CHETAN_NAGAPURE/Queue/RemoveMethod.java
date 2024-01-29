package com.mkpits.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveMethod {

	public static void main(String[] args)
	{
	        Queue<String> p=new PriorityQueue<String>();
	        p.add("This");
	        p.add("is");
	        p.add("java");
	 
	        System.out.println("Initial Queue " + p);
	 
	        p.remove("is");
	 
	        System.out.println("After Remove " + p);
	 
	       
	}

}
