package com.java.thread;

public class ThreadProgram extends Thread{
	
	public void run() {
		System.out.println("thread 1 ..........");
	}
	
	public static void main(String s1[]) {
		ThreadProgram  tp = new ThreadProgram();
		tp.start();
	}
	
	
}
