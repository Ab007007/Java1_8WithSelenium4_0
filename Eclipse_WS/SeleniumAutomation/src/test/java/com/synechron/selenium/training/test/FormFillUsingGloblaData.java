package com.synechron.selenium.training.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.synechron.selenium.training.utils.BrowserUtils;
import com.synechron.selenium.training.utils.ConfigReader;
import com.synechron.selenium.training.utils.ExcelUtils;

public class FormFillUsingGloblaData extends BrowserUtils 
{

	static String sheetname = "Sheet1";
	public static void main(String[] args) {

		System.out.println("Launching Browser");
		
		driver.get(ConfigReader.getProperty("formyurl"));
		
		int rowCount = ExcelUtils.rowcount(sheetname);
		String fn, ln, jt;
		for (int i = 1; i < rowCount; i++) {
			fn = ExcelUtils.getValue(sheetname, i, 0);
			ln = ExcelUtils.getValue(sheetname, i, 1);
			jt = ExcelUtils.getValue(sheetname, i, 2);
			
			driver.findElement(By.id("first-name")).sendKeys(fn);
			driver.findElement(By.id("last-name")).sendKeys(ln);
			driver.findElement(By.id("job-title")).sendKeys(jt);
			driver.findElement(By.id("radio-button-1")).click();
//			//div[text()='
//	        Male
//	      ']
			//driver.findElement(By.id("checkbox-1")).click();
			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//td[@class='today day']")).click();
			driver.findElement(By.xpath("//a[text()='Submit']")).click();
			
			
			WebElement successMessageElement = driver.findElement(By.xpath("//div[@role='alert']"));
			
			System.out.println("Successs Message : " + successMessageElement.getText());
		
			driver.get(ConfigReader.getProperty("formyurl"));
		}
		
		
		
		
	}
}
