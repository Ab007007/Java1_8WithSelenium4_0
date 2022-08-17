package com.synechron.selenium.training.suggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	
	public static void main(String[] args) {
		System.out.println("Launching Browser");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		suggestions.forEach(ele -> System.out.println(ele.getText()));
	}
}
