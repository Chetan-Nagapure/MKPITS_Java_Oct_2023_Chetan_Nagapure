package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException 
	{
      FileReader fr=new FileReader("D:\\\\java_file.txt");
      BufferedReader br=new BufferedReader(fr);
      String data= "";
      
      while((data=br.readLine())  !=null)
      {
    	  System.out.println(data);
      }
      fr.close();
      
	}

}
