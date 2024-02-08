package com.mkpits.collectionstack;

import java.util.Stack;

public class SearchMethod {

	public static void main(String[] args) 
	{
		Stack<Integer> integer=new Stack<Integer>();
		integer.push(1);
		integer.push(11);
		integer.push(21);
		integer.push(31);
		integer.push(41);
		integer.push(51);
		integer.push(61);
		integer.push(71);
		integer.push(81);// 2nd element
		integer.push(91);// 1st element
		
		System.out.println("Initial Stack:" +integer);
		
		 // Checking for the element "4" 
        System.out.println("Does the stack contains 31 ? :" +integer.search(31));
        
        // Checking for the element "0" 
        System.out.println("Does the stack contains 0 ? :" +integer.search(0));
        
        //if this element is present then it gives '2nd position'.
        // Checking for the element "81" 
        System.out.println("Does the stack contains 81 ? :" +integer.search(81));
        
        // if this element not present then it gives '-1' position.
        // Checking for the element "100" 
        System.out.println("Does the stack contains 100 ? :" +integer.search(100)); 
        
        
	}

}
