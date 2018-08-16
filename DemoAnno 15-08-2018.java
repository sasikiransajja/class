package com.reg.util;

import java.util.HashMap;

public class DemoAnno {

	
	public static void main(String[] args) {
		new B().m2();
		
		@SuppressWarnings("rawtypes")
		HashMap mp = new HashMap();
		
	}
	
}

class A{
	void m1(){
		System.out.println("A: im in m1");
	}	
}
class B extends A{
	
	@Override
	void m1(){
		System.out.println("B : im in m1");
	}
	@Deprecated
	void m2(){
		System.out.println("B : im in m1");
	}
}