package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class ArrayListAssignment2 {

	public static void main(String[] args) 
	{

      ArrayList<Integer> num = new ArrayList<Integer>();
      num.add(1);
      num.add(2);
      num.add(3);
      num.add(4);
      num.add(5);
      
      System.out.println("List1 :"+num);
      
      ArrayList<Integer> num1 = new ArrayList<Integer>();
      num1.add(6);
      num1.add(7);
      num1.add(8);
      num1.add(9);
      num1.add(10);
      
      System.out.println("List2 :"+num1);
      
      //Adding all element
      num.addAll(num1);
      System.out.println("Final list :"+num);
      
	}

}
