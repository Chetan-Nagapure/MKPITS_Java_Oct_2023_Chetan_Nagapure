package com.mkpits.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DoubleArrayList {

	public static void main(String[] args) 
	{
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(12.0);
		doubleList.add(13.4);
		doubleList.add(14.5);
		doubleList.add(15.5);
		doubleList.add(16.6);
		
		//1st way
		for(int i=0; i<doubleList.size(); i++)
	    {
			System.out.println(doubleList.get(i));
		}
		
		//2nd way
//		System.out.println("Using iterator");
//		Iterator<Double> itr = doubleList.iterator();
//		while(itr.hasNext());
//		
//		Double listDouble=itr.next();
//		System.out.println(listDouble);
		

	}

}
