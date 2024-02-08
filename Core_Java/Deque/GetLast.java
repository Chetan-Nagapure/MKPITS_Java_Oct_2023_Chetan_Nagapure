package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class GetLast 
{
	//The getLast() method of Deque Interface returns the last element or the tail of the Deque. 
	//It does not deletes the element. It throws an exception when the Deque is empty.

	public static void main(String[] args) 
	{
		Deque<Integer> d = new LinkedList<Integer>();
	       
        d.addLast(11);
        d.addLast(22);
        d.addLast(33);
        d.addLast(44);
        d.addLast(55);
        d.addLast(66);
 
        System.out.println("Deque :"+d);
        
     // print head 
        System.out.println("Deque's head: " + d.getLast()); 
		

	}

}
