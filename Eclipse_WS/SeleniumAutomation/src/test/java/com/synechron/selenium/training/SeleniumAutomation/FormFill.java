package com.synechron.selenium.training.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) {

		System.out.println("Launching Browser");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");

		driver.findElement(By.id("first-name")).sendKeys("Harry");
		driver.findElement(By.id("last-name")).sendKeys("KL");
		driver.findElement(By.id("job-title")).sendKeys("Business");
		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//td[@class='today day']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		
		WebElement successMessageElement = driver.findElement(By.xpath("//div[@role='alert']"));
		
		System.out.println("Successs Message : " + successMessageElement.getText());
		
		
	}
}
