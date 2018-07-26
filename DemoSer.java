package com.reg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s = new Student("Raj", 122, 0);
		FileOutputStream fout = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(s);
		
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s1= (Student) ois.readObject();
		s1.dis();
	}

}
