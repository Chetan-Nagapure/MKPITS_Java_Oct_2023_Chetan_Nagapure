package com.mkpits.collectionstack;

import java.util.Stack;

public class PushPopEmpty {

	public static void main(String[] args) 
	{
		Stack<Integer> integer=new Stack<Integer>();
		
		integer.push(100);
		integer.push(200);
		integer.push(300);
		integer.push(400);
		integer.push(500);
		
		System.out.println("Initial stack: "+integer);
		
		//POP element from the stack
		while (!integer.isEmpty()) 
		{
			System.out.println(integer.pop());
		}
		
	}

}
