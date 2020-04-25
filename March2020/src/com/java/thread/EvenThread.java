package com.java.thread;

public class EvenThread implements Runnable {

	SharedMemory sm;
	
	EvenThread(SharedMemory sm){
		this.sm = sm;

	}
	 public void run() {
		for(int i=0;i<100;i+=2)
		{
			synchronized (sm) {
				while(!sm.isEven) {
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
