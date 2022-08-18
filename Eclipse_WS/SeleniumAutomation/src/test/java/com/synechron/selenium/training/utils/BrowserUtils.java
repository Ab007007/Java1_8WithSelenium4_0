package com.synechron.selenium.training.utils;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static WebDriver driver = null;

	static {
		System.out.println("Cleaning old processs of driver");
		String drivers[] = {"edgeDriver.exe","chromedriver.exe", "geckodriver.exe"};
		List<String> driverList = Arrays.asList(drivers);
		
		driverList.forEach(ele -> {
			try {
				Runtime.getRuntime().exec("taskkill /F /IM " + ele);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		String browser = ConfigReader.getProperty("browser");
		String exeName = null;

		if(browser != null) {
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
//				exeName = "chromedriver.exe";
				break;
			case "ff":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
//				exeName = "geckodriver.exe";
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
//				exeName = "edgeDriver.exe";
				break;

			default:
				System.out.println("Error while creating browser");
				break;
			}
		}
		
		
	
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		driver.manage().timeouts().implicitlyWait(
				Duration.ofSeconds(Integer.valueOf(ConfigReader.getProperty("timeout"))));
		driver.manage().window().maximize();
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
		
	}

	public static void pirntSuggestion(String xpath) {
		System.out.println(
				"------------------------Reusable function output --------------------------------------------");
		List<WebElement> items = driver.findElements(By.xpath(xpath));
		items.forEach(ele -> System.out.println(ele.getText()));
		System.out.println("--------------------------------------------------------------------");

	}

}
