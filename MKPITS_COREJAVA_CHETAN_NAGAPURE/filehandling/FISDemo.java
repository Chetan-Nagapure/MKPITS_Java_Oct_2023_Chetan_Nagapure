package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

//FIS-File input stream 
public class FISDemo
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\DemoFile.txt");
		int b=0;
		while((b = fis.read())  != -1)
		{
			System.out.print((char)b);
		}
		fis.close();
		
	}

}
