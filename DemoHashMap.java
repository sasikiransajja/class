package com.reg.util;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {

		Map<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Sasi",97823355);
		phoneBook.put("Sai",43573355);
		phoneBook.put("Rajes",73355);
		phoneBook.put("Ramews",43573355);
			System.out.println(phoneBook.get("Sasi"));	
			Set<String> keySet = phoneBook.keySet();

			for (String key : keySet) {
				System.out.println(phoneBook.get(key));	
			}
		
				Set<Entry<String, Integer>> entrySet = phoneBook.entrySet();
				for (Entry<String, Integer> entry : entrySet) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
				}
				
				 
				
	}

}
