package com.synechron.selenium.training.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.selenium.training.utils.BrowserUtils;

public class MultiSelectDropDown extends BrowserUtils
{
	
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///D:/Synechron_11_08_javaSelenium/html/multiSelect.html");
		
		WebElement dd = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(dd);
		Thread.sleep(5000);
		sel.selectByIndex(2);
		
		Thread.sleep(5000);
		sel.selectByValue("audi");
		
		Thread.sleep(5000);
		sel.selectByVisibleText("Volvo");
		
		Thread.sleep(5000);
		sel.deselectByIndex(0);
		
		Thread.sleep(5000);
		sel.deselectByValue("mercedes");
		
		Thread.sleep(5000);
		sel.deselectByVisibleText("Audi");
		
		Thread.sleep(5000);
		sel.selectByIndex(2);
		
		Thread.sleep(5000);
		sel.selectByValue("audi");
		
		Thread.sleep(5000);
		sel.selectByVisibleText("Volvo");
		
		Thread.sleep(5000);
		sel.deselectAll();
	}

}
