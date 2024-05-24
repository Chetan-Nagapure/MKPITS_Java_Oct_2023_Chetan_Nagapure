package com.mkpits.thread;

public class MyWorkerThread extends Thread {
String message;

public MyWorkerThread(String s)
{
this.message = s;

}

@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName()+"(start) message=" +message);
	
	processmessage();//call processmessage method that
	
	System.out.println(Thread.currentThread().getName()+"End");
	
}

private void processmessage() {

try {
	Thread.sleep(1000);
} 
catch (InterruptedException e) 
{
	e.printStackTrace();
}
}

	
}
