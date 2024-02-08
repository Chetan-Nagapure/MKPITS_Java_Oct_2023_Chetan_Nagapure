package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class OfferLast
{

	public static void main(String[] args) 
	{
		Deque<Integer> d = new LinkedList<Integer>();
		  
        if (d.offerLast(10)) 
            System.out.println("The Deque is not full and 10 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerLast(15)) 
            System.out.println("The Deque is not full and 15 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerLast(25)) 
            System.out.println("The Deque is not full and 25 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerLast(20)) 
            System.out.println("The Deque is not full and 20 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        // before removing print Deque 
        System.out.println("Deque: " + d); 

	}

}
