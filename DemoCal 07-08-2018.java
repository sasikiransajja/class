package com.reg.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DemoCal {
 
	public static void main(String[] args) {
		TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
		Calendar c = Calendar.getInstance(zone);
		int hr= c.get(Calendar.HOUR);
		int m= c.get(Calendar.MONTH);
		System.out.println(m);
		
		Date d = new Date();
		System.out.println(d);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println(df1.format(d));
		
		
		
	}
}
