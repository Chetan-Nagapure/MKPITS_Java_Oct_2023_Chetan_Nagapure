package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class ArrayListAssignment1 {

	public static void main(String[] args) 
	{
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    
    System.out.println("Before Replacing :"+list); 
    
    //Replacing element
    list.set(1, "E");
    
    System.out.println("After Replacing :"+list);

	}

}
