package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class AddLast 
{

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
     
     //Using Linked Block Deque.   
        
    Deque<Integer> D= new LinkedBlockingDeque<Integer>(); 

    // Add numbers to end of DeQue 
    D.addLast(12); 
    D.addLast(13); 
    D.addLast(14); 

    try { 
        // when null is inserted 
        D.addLast(null); 
    } 
    catch (Exception e) 
    {  
       e.printStackTrace();
	}

	}
}
