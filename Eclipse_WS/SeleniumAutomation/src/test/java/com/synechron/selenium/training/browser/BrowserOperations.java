package com.synechron.selenium.training.browser;

import org.openqa.selenium.Cookie;

import com.synechron.selenium.training.utils.BrowserUtils;

public class BrowserOperations extends BrowserUtils
{
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://formy-project.herokuapp.com/thanks");
		Thread.sleep(5000);
		//to click on back button
		driver.navigate().back();
		Thread.sleep(5000);
		//to click on forward button
		driver.navigate().forward();
		Thread.sleep(5000);
		//to refresh
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		
		System.out.println("Current url " + driver.getCurrentUrl());
		
		System.out.println("Unique ID " + driver.getWindowHandle());
		
		System.out.println("Title " + driver.getTitle());
		
		Cookie c = new Cookie("username", "aravinda");
		driver.manage().addCookie(c);
		System.out.println(driver.manage().getCookieNamed("username"));
		
		driver.manage().deleteAllCookies();
		
		driver.close();
		
		
		
		
		
	}

}
