package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	
	static FileReader fr;

	public static void main(String[] args)
	{
		try {
			
			 fr =new FileReader("D:\\\\java_file.txt");
		      BufferedReader br=new BufferedReader(fr);
		      String data= "";
		      
		      while((data=br.readLine())  !=null)
		      {
		    	  System.out.println(data);
		      }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				
				fr.close();
				System.out.println("File closed");
			}catch(IOException e)
			{
			   e.printStackTrace();
			}
		}

	}

}
