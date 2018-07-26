package com.reg.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileOutput {
	
	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter text, * to exit");
		
		//String text=br.readLine();
		
		FileOutputStream fout = new FileOutputStream("dummy.txt",true);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		char ch;
		while((ch=(char) br.read())!='*'){
			bout.write(ch);
		}
		
		//fout.write(text.getBytes());
		bout.close();
	fout.close();
	}

}
