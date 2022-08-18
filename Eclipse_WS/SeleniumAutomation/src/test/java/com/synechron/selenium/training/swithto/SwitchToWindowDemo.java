package com.synechron.selenium.training.swithto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synechron.selenium.training.utils.BrowserUtils;

public class SwitchToWindowDemo extends BrowserUtils
{
	public static void main(String[] args) {
		
		driver.get("https://www.irctc.co.in/eticketing/errors.html#");
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		
		List<WebElement> emailIds = driver.findElements(By.tagName("a"));
		System.out.println("-------------Child Browser ------------------");
		emailIds.forEach(email -> System.out.println(email.getText()));
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("-------------Parent Browser ------------------");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.forEach(link -> System.out.println(link.getText()));
		driver.close();
	}

}
