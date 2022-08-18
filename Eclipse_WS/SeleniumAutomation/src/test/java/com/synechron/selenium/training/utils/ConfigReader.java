package com.synechron.selenium.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
//	public static void main(String[] args) throws FileNotFoundException, IOException {
//		
//		System.out.println(getProperty("browser"));
//	}
//	
//	
	public static String getProperty(String key) {
		String str = null;
		File f = null ;
		try {
			f = new File("data\\config.properties");
			Properties props = new Properties();
			props.load(new FileInputStream(f));
			str = props.getProperty(key);
		}catch(Exception ex) {
			System.out.println("Exception while reading config file");
		}

		return str;
	}
}
