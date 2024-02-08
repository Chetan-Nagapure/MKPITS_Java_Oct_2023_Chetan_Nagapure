package com.mkpits.Games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchSystem 
{
   
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        //System.out.println(number);
        int randomNum=(int) (Math.random()*100);
        System.out.println(randomNum);
        for(int i=1;i<=10; i++) 
        {
        	System.out.println("Enter the number:  ");
        
            int num = Integer.parseInt(br.readLine());        
        
        
		if(randomNum == num)
        
        	
        {
         System.out.println("values are match");
       
        }
        else if (randomNum > num)
        
        {
        	System.out.println("values of random number is greater than user number");
        }
        else 
        {
        	System.out.println("values of random number is less than user number");
        }
       
        }
        
	 
       }

}
