package com.synechron.selenium.training.actions;

import org.openqa.selenium.interactions.Actions;

import com.synechron.selenium.training.utils.BrowserUtils;

public class ActionsDemo extends BrowserUtils
{
	
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("synechron").perform();
		Thread.sleep(5000);
		
		// Print all the suggestions
	}

}
