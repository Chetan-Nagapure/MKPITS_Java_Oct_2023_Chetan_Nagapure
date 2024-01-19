package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortMethod {

	public static void main(String[] args) 
	{
		List<Integer> sort1 = new ArrayList<Integer>();
		
		sort1.add(10);
		sort1.add(30);
		sort1.add(20);
		sort1.add(50);
		sort1.add(40);
		
		System.out.println("Before sorting the number :" +sort1);
		
		Collections.sort(sort1);
		System.out.println(" after sorting Numbers in ascending order :"+sort1);
		
		Collections.reverse(sort1);
		System.out.println("after sorting Number in descending order :"+sort1);
		
	}

}
