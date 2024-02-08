package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class AddMethod 
{

	public static void main(String[] args) 
	{
		 
		Deque<Integer> d = new LinkedList<Integer>();
       
        d.add(11);
        d.add(22);
        d.add(33);
        d.add(44);
 
        System.out.println("Deque :"+d);
	}

}
