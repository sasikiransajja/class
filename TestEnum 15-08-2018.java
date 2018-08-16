package com.reg.util;

public class TestEnum {

	public static void main(String[] args) {
		//System.out.println(Days.MONDAY);
		
		Days[] values = Days.values();
		for (Days days : values) {
			System.out.println(days);
		}
		
		System.out.println(Months.JAN.getDays());
		
		Months[] values2 = Months.values();
		for (Months month : values2) {
			System.out.println(month.getDays());
		}
	}
	
	
}
