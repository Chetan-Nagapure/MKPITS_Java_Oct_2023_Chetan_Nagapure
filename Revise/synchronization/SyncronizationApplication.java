package com.mkpits.synchronization;

public class SyncronizationApplication {

	public static void main(String[] args) 
	{
		Table table1 = new Table();
		
		MyThread1 t1 = new MyThread1(table1);
		MyThread2 t2 = new MyThread2(table1);
		t1.start();
		t2.start();
		}

}
