package com.mkpits.collectionstack;

import java.util.Stack;

public class PeekMethod 
{
//Accessing Element
	//only show the last value of stack 
	//To retrieve or fetch the first element of the Stack or the element present at the top of the Stack, we can use peek(). method. 
	//The element retrieved does not get deleted or removed from the Stack. 
	public static void main(String[] args) 
	{
		Stack<String> list=new Stack<String>();
		
		list.push("Welcome");
		list.push("To");
		list.push("Java");
		list.push("Programming");
		list.push("Language");
		
		// Displaying the Stack
		System.out.println("Initial stack is :"+list);
		
		// Fetching the element at the head of the Stack
        System.out.println("The element at the top of the stack is :"+list.peek());
        
     // Displaying the Stack after the Operation
        System.out.println("Final Stack: " +list);
       
	}

}
