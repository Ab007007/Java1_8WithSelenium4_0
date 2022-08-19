package com.synechron.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.selenium.training.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillformUsingTestNG 
{
	WebDriver driver = null;
	String fn="abc", ln="qpr" , jt="abc";
	@BeforeMethod
	public void launch() {
		driver.get(ConfigReader.getProperty("formyurl"));
	}

	@BeforeTest
	public void createDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(
				Duration.ofSeconds(Integer.valueOf(ConfigReader.getProperty("timeout"))));
		driver.manage().window().maximize();
	
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
	
	
	@Test
	public void formFill()
	{
		driver.findElement(By.id("first-name")).sendKeys(fn);
		driver.findElement(By.id("last-name")).sendKeys(ln);
		driver.findElement(By.id("job-title")).sendKeys(jt);
		driver.findElement(By.id("radio-button-1")).click();
//		//div[text()='
//        Male
//      ']
		//driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//td[@class='today day']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		
		WebElement successMessageElement = driver.findElement(By.xpath("//div[@role='alert']"));
		
		System.out.println("Successs Message : " + successMessageElement.getText());
	
	
	}
	
}
