package com.synechron.trainings.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("data\\dummy.txt");
		
		FileInputStream fis = new FileInputStream(f);
		int i =  0;
		while((i = fis.read()) !=-1)
		{
			System.out.print((char)i);
		}
		
		
	}
}
