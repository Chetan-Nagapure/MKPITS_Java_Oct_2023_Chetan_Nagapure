package com.mkpits.collection;

import java.util.LinkedList;

public class LinkedLinkContains {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);
		list.add(900);
		list.add(1000);
		
		//Print the list
		System.out.println("The list is :"+list);
		
		// Check if the list contains "10"
		System.out.println("\n does the list contains '10' :"+list.contains(10));
		
		// Check if the list contains "20"
	    System.out.println("\n does the list contains '20' :"+list.contains(20));
	    
	 // Check if the list contains "1000"
	 	System.out.println("\n does the list contains '1000' :"+list.contains(1000));
	 	
	 // Check if the list contains "500"
	 	System.out.println("\n does the list contains '500' :"+list.contains(500));
	 		
	 		
	 		
	}

}
