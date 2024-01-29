package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class AddFirst 
{

	public static void main(String[] args) 
	{
		Deque<Integer> d = new LinkedList<Integer>();
	       
        d.addFirst(11);
        d.addFirst(22);
        d.addFirst(33);
        d.addFirst(44);
        d.addFirst(55);
 
        System.out.println("Deque :"+d);
        
        

	}

}
