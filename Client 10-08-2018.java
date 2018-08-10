package com.reg.thread;

public class Client {
	public static void main(String args[]){  
		final Banking c=new Banking();  
		new Thread(){  
		public void run(){
			c.withdraw(15000);
			}  
		}.start();  
		
		new Thread(){  
		public void run(){c.deposit(10000);}  
		}.start();  
		  
		}}  
