package com.reg.thread;

public class DemoMulti {

	public static void main(String[] args) {
		DemoBooking obj = new DemoBooking();
		DemoBooking obj1 = new DemoBooking();
		
		for(int i=0;i<10;i++){
			Thread t1 = new Thread(obj,"Book ticke");
			Thread t2 = new Thread(obj1,"Cut ticket");
			t1.start();
			t2.start();
		}
	}
}


class DemoBooking extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}