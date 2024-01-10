package com.mkpits.array;

public class CopyOfRange {

	public static void main(String[] args)
	{

      String[] copyFrom = {"Chetan","yash","saurabh","sumit","Ankit","Vaibhav","Raj","Vinay","Harsh","Pranav","Kaushik","Shreyash"};
      
      String [] copyTo=java.util.Arrays.copyOfRange(copyFrom, 1, 10);
      {
    	  for(String name : copyTo)
    	  {
    		  System.out.println(name +" ");
    	  }
      }

	}

}
