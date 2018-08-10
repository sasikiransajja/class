package com.reg.thread;

public class DemoBusBooking {
	
	public static void main(String[] args) {

		RedBus bus = new RedBus(1); 
		Thread t = new Thread(bus,"Raj");
		Thread t1 = new Thread(bus,"Rajesh");
		Thread t3 = new Thread(bus,"sasi");

		t.start();
		t1.start();
		t3.start();
	}
}

class RedBus extends Thread {
	int available = 1;
	int wanted;

	public RedBus(int wanted) {
		super();
		this.wanted = wanted;
	}
	
	@Override
	public void run() {
		synchronized (this) {
			if(available>=wanted){
				try {
					System.out.println("Seat booked to"+Thread.currentThread().getName());
					Thread.sleep(1500);
					available=available-wanted;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Sorry no seats....pl try some other bus");
			}	
		}
		
		
	}
}