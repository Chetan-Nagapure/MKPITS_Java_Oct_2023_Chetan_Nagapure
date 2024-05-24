package com.mkpits.InterThreadingCommunication;

public class Notifier implements Runnable
{
	
	private Message msg;
	
	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"started");
		
		try {
			Thread.sleep(5000);
			synchronized (msg) 
			{
			// msg.set(name+"work done");
				msg.setMsg(name+ "work done");
				msg.notifyAll();
			}
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

}
