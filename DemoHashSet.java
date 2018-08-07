package com.reg.util;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	
	public static void main(String[] args) {
		
		Set<String> names= new HashSet<String>();
		names.add("Raj");
		names.add("ram");
		names.add("abc");
		names.add("1ssf");
		names.add("Rajesh");
		boolean flag=names.add("Raj");	
		System.out.println(flag);
		System.out.println(names.size());
		System.out.println(names);
		
		
	}

}
