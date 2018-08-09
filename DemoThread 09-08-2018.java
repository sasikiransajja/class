package com.reg.thread;

public class DemoThread {

	
	public static void main(String[] args) {
		System.out.println("Hi");
		
		String name=Thread.currentThread().getName();
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		System.out.println(name);
		
		
		DemoTRun obj = new DemoTRun();
		
		Thread t = new Thread(obj);
		t.setName(name);
		 

		t.setPriority(Thread.MAX_PRIORITY);;
		
		Thread t1 = new Thread(obj,"Two");
		t1.start();
	}
}

class DemoT extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
	}
}
class DemoTRun implements Runnable{
 	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}