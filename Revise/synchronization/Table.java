package com.mkpits.synchronization;

public class Table {
	
	synchronized public void printTable(int n) {
		
		//syncronized(this)
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(n*i);
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//}
		}
	}

}
