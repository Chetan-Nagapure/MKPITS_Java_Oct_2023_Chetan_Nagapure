package com.mkpits.String;

import com.mkpits.methods.Details;

public class StringBufferOverview 
{

	public static void main(String[] args) 
	{
      StringBufferOverview bufferOverview=new StringBufferOverview();
      bufferOverview.manipulateString();
		
	}
	public void manipulateString()
	{
		String myStr="A thread Safe";
		StringBuffer details=new StringBuffer(myStr);
		
		String newStr="A string buffer";
		details =details.append("\t" +newStr);
		System.out.println(details);
		
		
		//int a=details.capacity();
		//System.out.println(a);//..........o/p : total word - 29 ex: A thread - 7
		
		//details.trimToSize();
		//System.out.println(details);
		
		int d=details.length();
		System.out.println(d);
	
    //  String myStr="A thread Safe";
	//  StringBuffer details=new StringBuffer(myStr);
	   // System.out.println(details.delete(2, 5)); //.......o/p : A ead safe
		
      //String myStr="A thread Safe";
	  //StringBuffer details=new StringBuffer(myStr);
	  //  System.out.println(details.charAt(2));//....... o/p : it represent the char value t
		
	    System.out.println(details.insert(9, newStr)); //.......it paste the "a string buffer" into 9 position A thread "a string buffer" safe.
		
		System.out.println();
		
		
		
		
	}

}
