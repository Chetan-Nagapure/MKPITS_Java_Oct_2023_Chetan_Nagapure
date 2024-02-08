package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data");
		String str=br.readLine();
		
		str=str + "\n";
		
	    FileWriter fw=new FileWriter("D:\\java_file.txt",true);
	    fw.write(str);
	    fw.close();
	    System.out.println("Data is written");
		
	}

}
