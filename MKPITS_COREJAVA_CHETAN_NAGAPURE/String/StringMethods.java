package com.mkpits.String;

public class StringMethods {

	public static void main(String[] args) 
	{
		StringMethods method=new StringMethods();
		method.getData();

	}
	private void getData()
	{
		String fname="chetan";
		String lname="nagapure";
		
		System.out.println();
		
		System.out.println(String.join(":",fname,lname));//it joins the first and last name.
		System.out.println("Fname.length="+fname.length());//it shows the length of name means how many words are there Ex:chetan-6. 
		System.out.println("Fname to lowercase="+fname.toLowerCase());//it shows the name in small letters.
		System.out.println("Fname to uppercase="+fname.toUpperCase());//it shows the name in capital letters.
		System.out.println(fname.charAt(4));//it is represent the position of name ex:chetan/ a-4.
		System.out.println("Fname.equalsIgnoreCase="+fname.equalsIgnoreCase(lname));//if first and last name is same then condition is true otherwise false.
		System.out.println("Fname.startsWith="+fname.startsWith("h"));//if first word of name is "c" then is true ; if we put "h" then it false.
		System.out.println("Fname.endswith="+fname.endsWith("n"));//if last word of fname is "n" then it is true otherwise false.
	    System.out.println("Fname concat with lname="+fname.concat(lname));
	  
	}

}
