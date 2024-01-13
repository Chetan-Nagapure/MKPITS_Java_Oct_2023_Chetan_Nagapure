package com.mkpits.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//change the format of date and time.
public class LocalFormatter {

	public static void main(String[] args) 
	{
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Before formatting:" +datetime);
	    DateTimeFormatter formatdatetime=DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		
	 // DateTimeFormatter formatdatetime=DateTimeFormatter.ofPattern("E,mm-dd-yyyy HH:MM:SS");
		
		String formatteddatetime=datetime.format(formatdatetime);
		System.out.println("After formatting :"+formatteddatetime);

	}

}
