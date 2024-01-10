package com.mkpits.methods;

public class MethodswithNoReturntypeNoParameter {

	public static void main(String[] args)
	{
		//Non static method must be create object
		MethodswithNoReturntypeNoParameter m=new MethodswithNoReturntypeNoParameter();
		//classname obj = new classname/constructor();
		m.getData();//object_name/method_name
		
		
	}
 //Non static method 
	public void getData()//Access specifier/return type/methodname()
 {
	String  firstName="chetan"; //datatype/variable_name
	System.out.println(firstName);
	 
 }
	
	
}
