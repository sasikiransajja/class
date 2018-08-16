package com.reg.util;

public enum Months {
	JAN(31),FEB(28),MARCH(31);
	
public int days;

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}

Months(int d){
	days=d;
}
	
}
