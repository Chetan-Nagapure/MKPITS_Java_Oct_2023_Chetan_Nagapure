package com.mkpits.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) 
	{
      Integer []arr= {2,21,23,5,67,87,98};
      
      Arrays.sort(arr,Collections.reverseOrder());
      
      for(Integer num:arr )
      {
    	  System.out.println(num);
      }
      System.out.println("modified arr[] :"+ Arrays.toString(arr));
      
	}

}
