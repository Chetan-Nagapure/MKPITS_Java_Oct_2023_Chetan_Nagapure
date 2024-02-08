package com.mkpits.String;

public class StringOverview {

	public static void main(String[] args) 
	{
		StringOverview overview=new StringOverview();
		overview.getoverview();
		
	}
	private void getoverview()
	{
		String fname="chetan";
		String lname="Nagapure";
		
		System.out.println(String.join(":",fname, lname));
		
		byte [] b= {65,66,67,68,69,50};
		char ch []= {'x','y','z','1','2'};
		
		//constructor of string
		String s1=new String();
		System.out.println("S1:"+s1);
		
		String s2=new String(b);
		System.out.println("S2:"+s2);
		
		String s3=new String(b,0,3);
		System.out.println("S3:"+s3);
		
		String s4=new String(ch);
		System.out.println("S4:"+s4);
		
		String s5=new String(ch,2,2);
		System.out.println("S5:"+s5);
		
		String s6=new String(s2);
		System.out.println("S6:"+s6);
		
		
		
	}

}
