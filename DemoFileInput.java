package com.reg.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoFileInput {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("D:/hello.txt");
		BufferedInputStream bis= new BufferedInputStream(fis);
		int x;
		while((x=bis.read())!=-1){
			System.out.print((char)x);
		}
		bis.close();
		fis.close();
	}
	
}
