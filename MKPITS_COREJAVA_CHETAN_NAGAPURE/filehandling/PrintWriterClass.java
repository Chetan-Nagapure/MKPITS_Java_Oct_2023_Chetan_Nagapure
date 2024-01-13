package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException
	{
	  PrintWriter pw=new PrintWriter(System.out,true);
	  pw.println("Hello.....");
	  
	  PrintWriter pw1=new PrintWriter(new FileWriter("D:\\java_file.txt",true),true);
	  pw1.println("this is print");
	  
	}

}
