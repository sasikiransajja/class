package com.reg.util;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Raj");
		al.add("Rajesh");
		al.add("Ram");
		al.add("abc");
		//System.out.println(al.get(1));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
