package com.synechron.selenium.training.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	
	public static void main(String[] args) {
		System.out.println("Launching Browser");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		
		driver.get("file:///D:/Synechron_11_08_javaSelenium/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		
		FluentWait<WebElement> wait = new 
				FluentWait<WebElement>(driver.findElement(By.id("demo"))).
				withTimeout(Duration.ofSeconds(20)).
				pollingEvery(Duration.ofMillis(100)).
				ignoring(NoSuchElementException.class);
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				boolean flag = false;
				if(ele.isDisplayed())
				{
					System.out.println("ELEMENT IS DISPLAYED!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting!!!!!***********");
				}
				
				return flag;
			}
		};
		
		
		wait.until(fun);
						
		System.out.println(driver.findElement(By.id("demo")).getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
		
	}
}
