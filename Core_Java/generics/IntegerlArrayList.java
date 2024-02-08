package com.mkpits.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerlArrayList {

	public static void main(String[] args) 
	{
		//List<Integer> integerList = new ArrayList<Integer>();
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		// 1st way
		for(int i=0; i<integerList.size();i++)
		{
			System.out.println(integerList.get(i));
		}
		
		//2nd way
//		for(Integer integer : integerList)
//		{
//			System.out.println(integer);
//		}
			
			
	}

}
