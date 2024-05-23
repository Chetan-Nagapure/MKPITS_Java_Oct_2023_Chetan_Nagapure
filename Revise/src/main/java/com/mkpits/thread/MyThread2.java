package com.mkpits.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() 
	{
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
		e.printStackTrace();
		}

		for(int i=1; i<=5; i++)
		{
			System.out.println("thread by" + "runnable interface====" + i +"");
		}
		
	}

}
