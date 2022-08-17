package com.synechron.selenium.training.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {

	public static WebDriver driver = null;
	
	static {
		
		try 
		{
			System.out.println("Cleaning old processs of driver");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Driver is initialized by  BrowserUtils");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		
	}
	
	
}
