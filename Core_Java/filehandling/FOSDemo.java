package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//FOS - File output stream
public class FOSDemo 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data to be written");
		String str = br.readLine();
		
		str = str +"\n";
		
		FileOutputStream fos=new FileOutputStream("D:\\DemoFile.txt",true);
		byte b[]=str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Data is written");
		
	}

}
