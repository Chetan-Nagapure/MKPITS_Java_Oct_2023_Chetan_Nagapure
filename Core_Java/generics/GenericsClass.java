package com.mkpits.generics;

public class GenericsClass {

	public static void main(String[] args) 
	{
		//For Non Bounded
		Integer[] intarr = {1,2,3,4,5,6};
		PrintData<Integer>printArray = new PrintData<Integer>();
		printArray.print(intarr);
		
		String[] stringarr= {"Chetan", "Yash", "Ankit", "Vaibhav"};
		PrintData<String>printstring = new PrintData<String>();
		printstring.print(stringarr);
		
		Double[] doublearr= {11.02,12.03,13.04,14.05,15.06};
		PrintData<Double>printdouble = new PrintData<Double>();
		printdouble.print(doublearr);
		
		//For Bounded
		Integer[] intArr= {1,2,3, 4,5,6};
		PrintSum<Integer> arraysum = new PrintSum<Integer>();
		arraysum.print(intArr);
		
		

	}

}
