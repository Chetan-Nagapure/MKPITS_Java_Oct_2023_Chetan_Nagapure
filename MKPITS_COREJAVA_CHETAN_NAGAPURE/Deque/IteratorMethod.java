package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorMethod 
{
	//The iterator() method of Deque Interface returns an iterator over the elements in this deque in a proper sequence. 
	//The elements will be returned in order from first (head) to last (tail). 
	//The returned iterator is a “weakly consistent” iterator.

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
        
        Iterator itr = d.iterator(); 
        
        // Print elements of iterator 
        // created from Deque 
        System.out.println("The iterator values" + " of Deque are:"); 
  
        // prints the elements using an iterator 
        while (itr.hasNext()) 
        { 
            System.out.println(itr.next()); 
       
        }

}
}