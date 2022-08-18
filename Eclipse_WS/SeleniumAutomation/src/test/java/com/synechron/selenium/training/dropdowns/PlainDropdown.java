package com.synechron.selenium.training.dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.training.utils.BrowserUtils;

public class PlainDropdown extends BrowserUtils
{
	public static void main(String[] args) {
		
		driver.get("http://formy-project.herokuapp.com/");
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='dropdown-menu show']"))));
		
		driver.findElement(By.xpath("//a[text()='Enabled and disabled elements' and @class='dropdown-item']")).click();
		
		
		
	}

}
