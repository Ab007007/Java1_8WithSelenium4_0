package com.synechron.selenium.training.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.training.utils.BrowserUtils;

public class MouseMovementDemo extends BrowserUtils
{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		ele.click();
		
		//Mouse Movement
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Electronics']/ancestor::a"))).perform();
		Thread.sleep(5000);
		pirntSuggestion();
		//Print the Contents
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Fashion']/ancestor::a"))).perform();
		Thread.sleep(5000);
		pirntSuggestion();
		//Print the Contents
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Home']/ancestor::a"))).perform();
		Thread.sleep(5000);
		pirntSuggestion("//a[@class='_6WOcW9']");
		//Print the Contents
	}
	
	public static void pirntSuggestion()
	{
		System.out.println("--------------------------------------------------------------------");
		List<WebElement> items = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
		items.forEach(ele -> System.out.println(ele.getText()));
		System.out.println("--------------------------------------------------------------------");
		
	}

}
