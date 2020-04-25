package com.java.thread;

public class Oddthread implements Runnable{
	SharedMemory sm;

	Oddthread(SharedMemory sm)
	{
		this.sm = sm;
	}

	public void run() {
		for(int i=1;i<100;i+=2)
		{
			synchronized (sm) {
				while(sm.isEven) {
					try {
						sm.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				sm.isEven = !sm.isEven;
				sm.notify();
			}
		}
	}
}
