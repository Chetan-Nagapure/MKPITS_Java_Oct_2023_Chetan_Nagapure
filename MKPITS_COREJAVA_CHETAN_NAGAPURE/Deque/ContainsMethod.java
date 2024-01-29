package com.mkpits.collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class ContainsMethod 
{

	public static void main(String[] args) 
	{
		 Deque<String>  d= new LinkedList<String>(); 
		  
	        // Use add() method to add elements into the Queue 
	        d.add("This"); 
	        d.add("is"); 
	        d.add("Java"); 
	        d.add("Programming"); 
	        d.add("Language"); 
	  
	        // Displaying the Deque 
	        System.out.println("Deque: " + d); 
	  
	        // Check for "This" in the deque 
	        System.out.println("Does the deque contains 'Geeks'? "+ d.contains("This"));
	        
	     // Check for "Program" in the deque 
	        System.out.println("Does the deque contains 'Geeks'? "+ d.contains("Program"));
	        
	        
	}

}
