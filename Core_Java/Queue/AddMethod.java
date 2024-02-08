package com.mkpits.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddMethod 
{

	
	public static void main(String[] args)
	{
		Queue<String> pq = new PriorityQueue<String>();
		 
        pq.add("This");
        pq.add("is");
        pq.add("Java");
 
        System.out.println(pq);

	}

}
