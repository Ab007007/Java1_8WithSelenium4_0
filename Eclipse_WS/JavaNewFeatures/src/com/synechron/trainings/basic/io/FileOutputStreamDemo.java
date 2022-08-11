package com.synechron.trainings.basic.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("data\\newFile.txt");
		if(f.exists()) {
			System.out.println("file exist");
		}
		else
		{
			f.createNewFile();
		}
			
		
		FileOutputStream fos = new FileOutputStream(f, true);
		
		String str = "hello all i'm from java\n";
		byte[] b = str.getBytes();
		fos.write(b);
		fos.close();
	}
}
