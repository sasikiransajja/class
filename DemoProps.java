package com.reg.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProps {

	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:/sasi/javaprograms/java_workspace/javaprograms/db.properties");
		Properties prop= new Properties();
		
		prop.load(fis);
		
		String n= prop.getProperty("name");
		System.out.println(n);
		
	}
}
