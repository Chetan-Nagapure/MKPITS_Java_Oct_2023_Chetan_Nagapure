package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class OfferFirst 
{

	public static void main(String[] args) 
	{
		Deque<Integer> d = new LinkedBlockingDeque<Integer>(3);
		  
        if (d.offerFirst(10)) 
            System.out.println("The Deque is not full and 10 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerFirst(15)) 
            System.out.println("The Deque is not full and 15 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerFirst(25)) 
            System.out.println("The Deque is not full and 25 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (d.offerFirst(20)) 
            System.out.println("The Deque is not full and 20 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        // before removing print Deque 
        System.out.println("Deque: " + d); 
		
	}

}
