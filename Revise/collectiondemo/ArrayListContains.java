package com.mkpits.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListContains {

	public static void main(String[] args) {

ArrayList<String> list1 = new ArrayList<String>();
ArrayList<String> list2 = new ArrayList<String>();

list1.add("red");list1.add("white");
list2.add("red");list2.add("blue");

ArrayList<String> res =new ArrayList<String>();
for (String e : list1) 
{
	res.add(list2.contains(e)?"yes":"no");
}
System.out.println("Result :"+res);


	}

}
