package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {

	public static void main(String[] args)
	{
		List<String> list =new ArrayList<String>();
		list.add("Java");
		list.add("Programming");
		list.add("Language");
		
		//it will check the element in the list and shows the result whether it is true or false.
		boolean ispresent = list.contains("Java");
		System.out.println("java is present in the list :"+ispresent);// true

	}

}
