package com.synechron.trainings.java18.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LinesDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Synechron_11_08_javaSelenium\\Eclipse_WS\\JavaNewFeatures\\src\\com\\synechron\\trainings\\java18\\innerclasses\\AnnoymousInnerClass.java");
		
		 Stream<String> s = Files.lines(f.toPath());
		 
		 s.forEach(System.out :: println);
	}
}
