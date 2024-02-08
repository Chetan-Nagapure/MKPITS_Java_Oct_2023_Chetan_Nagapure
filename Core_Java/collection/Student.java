package com.mkpits.collection;

import java.util.Objects;

public class Student

{
 private String name;
 private Integer rollno;
public Student(String name, Integer rollno) 
{
	//super();
	this.name = name;
	this.rollno = rollno;
}

@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + "]";
}

//model class
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
@Override
public int hashCode() {
	return Objects.hash(name, rollno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(name, other.name) && Objects.equals(rollno, other.rollno);
}


 
 
}
