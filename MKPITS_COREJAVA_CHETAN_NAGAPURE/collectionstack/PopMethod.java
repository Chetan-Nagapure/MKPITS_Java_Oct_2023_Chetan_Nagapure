package com.mkpits.collectionstack;

import java.util.Stack;

public class PopMethod 
{
//To pop an element from the stack, we can use the pop() method.
//The element is popped from the top of the stack and is removed from the same.
	public static void main(String[] args) 
	{
		Stack<Integer> integer=new Stack<Integer>();
		
		integer.add(10);
		integer.add(20);
		integer.add(30);
		integer.add(40);
		integer.add(50);
		
		System.out.println("Initial Stack :" +integer);
		
		// Removing elements using pop() method
        System.out.println("Popped element: "+integer.pop());
        
        System.out.println("Popped element: "+integer.pop());
        
     // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation: " +integer);
                           
           
	}

}
