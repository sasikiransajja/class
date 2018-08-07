package com.reg.util;

import java.text.NumberFormat;
import java.util.Locale;

public class DemoFactoryMethods {
	
	public static void main(String[] args) {
		
		float dollr=10.5f;
		
		NumberFormat fmt =NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(fmt.format(dollr));
		
		float sal=010424.54354f;
		NumberFormat fmtNumber =NumberFormat.getNumberInstance();
		fmtNumber.setMaximumIntegerDigits(5);
		fmtNumber.setMaximumFractionDigits(2);
		
		System.out.println(fmtNumber.format(sal));
		
		
		
	}

}
