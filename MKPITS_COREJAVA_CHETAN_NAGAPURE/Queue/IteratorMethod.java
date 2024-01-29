package com.mkpits.collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteratorMethod 
{

	public static void main(String[] args) 
	{
		Queue<String> p=new PriorityQueue<>();
        p.add("This");
        p.add("is");
        p.add("java");
        p.add("Language");
 
        System.out.println("Initial Queue " + p);
	   
        Iterator itr = p.iterator();
        
        while (itr.hasNext()) 
        {
        	
            System.out.print(itr.next() +" ");
       
        }
	}
}
		

	


