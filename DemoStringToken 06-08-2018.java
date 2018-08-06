package com.reg.util;

import java.util.StringTokenizer;

public class DemoStringToken {

	 
	public static void main(String[] args) {
		
		String name="This is raj from bengalores ";
		
		StringTokenizer st = new StringTokenizer(name, " ");
		
		while (st.hasMoreElements()) {
			String token = (String) st.nextElement();
			System.out.println(token);
		}
		
	}

}
