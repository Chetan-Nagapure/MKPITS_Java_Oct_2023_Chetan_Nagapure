package com.mkpits.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudent(){
		List<Student> students=new ArrayList<>();
		//add data
		students.add(new Student("Vinay","Thaware","vinay@gmail.com"));
		students.add(new Student("Raj","Warhoker","raj@gmail.com"));
		students.add(new Student("Regved","Pande","regved@gmail.com"));
		students.add(new Student("Vaibhav","Padlewar","vaibhav@gmail.com"));
		
		//return list
		return students;
	}
}
