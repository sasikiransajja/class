package com.reg.generics;

import oracle.sql.NUMBER;

public class DemoGen {


	public static void main(String[] args) {
		
		DGen<Integer> d = new DGen<>(new Integer(12));
		
		d.disp();
		//DGen<String> d1 = new DGen<>("Hi");
		
		d.disp();
		
		DGenOne.disp(d);
		DGenOne.disp(new String(""));
	}
}

class DGenOne{
	
	public static <GT extends Number> GT disp(GT obj){
		System.out.println(obj);
		return obj;
		
	}
}
//class DGen<GT extends Number&Comparable>

class DGen<GT extends Number>{
	GT obj;

 public DGen(GT obj) {
		this.obj = obj;
	}
	
 public void  disp(){
	 System.out.println(obj);
	 System.out.println(obj.getClass().getName());
 }
 
 public GT getObj(){
	 
	return obj;
	 
 }
 
}