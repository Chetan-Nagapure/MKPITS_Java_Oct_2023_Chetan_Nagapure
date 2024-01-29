package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class OfferMethod 
{
	//The offer(E e) method of Deque Interface inserts the specified element into this Deque if it is possible to do so immediately without violating capacity restrictions. 
	//This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.

	public static void main(String[] args) 
	{
		 
        Deque<Integer> d = new LinkedList<Integer>(); 
  
        if (d.offer(10)) 
            System.out.println("The Deque is not full and 10 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offer(15)) 
            System.out.println("The Deque is not full and 15 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offer(25)) 
            System.out.println("The Deque is not full and 25 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offer(20)) 
            System.out.println("The Deque is not full and 20 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        // before removing print Deque 
        System.out.println("Deque: " + d); 
	}

}
