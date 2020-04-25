package com.java.thread;


class SharedMemory {
	boolean isEven = true;
}

public class ThreadUsingInterface{
	public static void main(String arg[]) throws InterruptedException
	{
        SharedMemory sm = new SharedMemory();		
		EvenThread ev = new EvenThread(sm);
		Oddthread od = new Oddthread(sm);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("anom. class");
			}
		});
		Thread t2 = new Thread(od);
		t1.start();
		t2.start();
	      
		t1.join();
		t2.join();
	
		
		System.out.println("heekki");
	}
}