package com.mkpits.collection;

import java.util.ArrayList;

public class StudentMainClass {

	public static void main(String[] args) 
	{
		
		ArrayList<Student> studentList1=new ArrayList<Student>();
		studentList1.add(new Student("Chetan", 1));
		studentList1.add(new Student("Yash", 2));
		studentList1.add(new Student("Ankit", 3));
		studentList1.add(new Student("Vaibhav", 4));
		
		ArrayList<Student> studentList2=new ArrayList<Student>();
		studentList2.add(new Student("Chetan", 1));
		studentList2.add(new Student("Sarthak", 5));
		studentList2.add(new Student("Pranay", 6));
		studentList2.add(new Student("Nishant", 7));
		
		System.out.println("Displaying list1");
		for (Student student : studentList1) 
		{
			System.out.println(student);
		}
		
		System.out.println("Displaying list2");
		for (Student student : studentList2) 
		{
			System.out.println(student);
		}
		
		System.out.println("addAll Method ");
		
		studentList1.addAll(studentList2);
		
		//Displaying Horizontal Data
		
		//1st way
		//System.out.println(studentList1);
		
		//Displaying vertical data
		
		//2nd way
		for (int i = 0; i < studentList1.size(); i++) 
		{
			System.out.println(studentList1.get(i));
		}
		
		System.out.println("retainAll ");
		
		studentList1.retainAll(studentList2);
		
		System.out.println(studentList1);
		
		
		
		
		
	}

}
