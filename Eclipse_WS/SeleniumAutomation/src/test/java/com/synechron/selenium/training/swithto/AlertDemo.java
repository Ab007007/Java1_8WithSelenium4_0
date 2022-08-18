package com.synechron.selenium.training.swithto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;

import com.synechron.selenium.training.utils.BrowserUtils;

public class AlertDemo extends BrowserUtils
{
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		
		driver.findElement(By.id("alert-button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().sendKeys("DSFSD");
		
	}

}
