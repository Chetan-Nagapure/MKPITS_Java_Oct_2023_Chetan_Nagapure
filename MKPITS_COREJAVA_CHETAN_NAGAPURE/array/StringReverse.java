package com.mkpits.array;

public class StringReverse {

	public static void main(String[] args) 
	{
		String name="chetan";
		char ch[]=new char[name.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=name.charAt(i);
		}
         for(char c:ch)
         {
        	 System.out.println(c);
         }
         System.out.println("\n Reverse Order");
         for(int i=ch.length-1;i >=0;i--)
         {
        	 System.out.println(ch[i]);
         }
	}

}
