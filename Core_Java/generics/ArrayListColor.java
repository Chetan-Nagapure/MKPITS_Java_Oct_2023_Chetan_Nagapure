package com.mkpits.generics;

import java.util.ArrayList;

public class ArrayListColor 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colorlist1=new ArrayList<String>();
		
		if(colorlist1.isEmpty())
		{
			colorlist1.add("Red");
			colorlist1.add("Yellow");
			colorlist1.add("Blue");
			colorlist1.add("Green");
			colorlist1.add("Black");
		}
		System.out.println("Print colorlist1 :");
	    
		for(String color : colorlist1)
		{
			System.out.println(color);
		}
		
		System.out.println();
		
		ArrayList<String> colorlist2 = new ArrayList<String>();

		if(colorlist2.isEmpty())
		{
			colorlist2.add("Red");
			colorlist2.add("Purple");
			colorlist2.add("Pink");
			colorlist2.add("White");
			colorlist2.add("Green");
		}
		System.out.println("Print colorlist2 :");
		
		for(String color : colorlist2)
		{
			System.out.println(color);
		}
		
		//It print the colorlist2 in colorlist1 and shows total element in colorlist1.
		
		System.out.println("\n colorlist1 after addAll()");
		colorlist1.addAll(colorlist2);
	    System.out.println("\n size of colorlist1 is " +colorlist1.size());
		System.out.println("\n print colorlist1");
	    
		for(String color : colorlist1)
		{
			System.out.println(color);
		}
		
		//Add element in the colorlist1.
		System.out.println("\n colorlist1 add element ");
		colorlist1.add("Black");
		
		for(String color : colorlist1)
		{
			System.out.println(color);
		}
		
		
		//It print similar element from colorlist1 and colorlist2 and also print colorlist2. 
		
		System.out.println("\n colorlist1 retainall colorlist2");//it print the duplicate name in colorlist1
		colorlist1.retainAll(colorlist2);
		System.out.println("\n print colorlist1");
		
		for(String color : colorlist1)
		{
			System.out.println(color);
		}
		
		//Remove colorlist2 from colorlist1 and it also remove duplicate element from them.
		
//		System.out.println("\n colorlist1 removeall colorlist2");
//		colorlist1.removeAll(colorlist2);
//		System.out.println("\n print colorlist1");
//		
//		for(String color : colorlist1)
//		{
//			System.out.println(color);
//		}
		
		
//		
		
		
	}
}
		


