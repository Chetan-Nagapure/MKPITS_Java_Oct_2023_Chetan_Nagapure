package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SnakeWaterGun {

	public static void main(String[] args) throws IOException
	{
		
   String input[]= {"Snake","Water","Gun"};

   Random random=new Random();
   int randomInput=random.nextInt(input.length);
   
   String sysInput=input[randomInput];
   
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter your choice: \n1.S,\n2.W,\n3.G");
   String userInput=br.readLine();
   
   
   
   

	}	

}
