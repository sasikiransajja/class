package com.reg.util;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {

		Set<Emp> emps= new HashSet<>();
		
		Emp ram= new Emp(200, "ram");
		Emp raj= new Emp(500, "sasi");
		Emp ram1= new Emp(200, "ram");
		Emp sai= new Emp(420, "sai");
		
		emps.add(ram);
		emps.add(raj);
		
		
		emps.add(ram1);
		emps.add(sai);
		 
		for (Emp emp : emps) {
			System.out.println(emp.toString());
		}
		
	}

}
class Emp{
	int marks;
	String name;
	public Emp(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int hashCode() {
		System.out.println("hasCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("im in equal");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp [marks=" + marks + ", name=" + name + "]";
	}
	
}