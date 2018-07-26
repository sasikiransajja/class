package com.reg.io;

import java.io.Serializable;

public class Student implements Serializable {

	public Student(String name, int id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	private String name;
	private int id;
	transient private int marks;
	static private String college = "xyx";
	
	void dis(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

}
