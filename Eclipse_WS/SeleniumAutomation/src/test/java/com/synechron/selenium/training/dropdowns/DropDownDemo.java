package com.synechron.selenium.training.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.selenium.training.utils.BrowserUtils;

public class DropDownDemo extends BrowserUtils
{

	
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://formy-project.herokuapp.com/form");
		WebElement dropdown = driver.findElement(By.id("select-menu"));
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(2);
		Thread.sleep(5000);
		sel.selectByValue("4");
		Thread.sleep(5000);
		sel.selectByVisibleText("0-1");
		
	}
}
