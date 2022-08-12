package com.synechron.trainings.java18.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WalkDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("src");
		
		 Stream<Path> s = Files.walk(f.toPath());
		 
		 s.forEach(System.out :: println);
	}
}
