package com.mkpits.generics;

import java.util.ArrayList;
import java.util.List;

public class BooleanArrayList {

	public static void main(String[] args)
	{
      
		List<Boolean> answerList= new ArrayList<Boolean>();
		answerList.add(true);
		answerList.add(false);
		
		for(int i=0; i<answerList.size(); i++)
		{
			System.out.println(answerList.get(i));
		}
		


	}

}
