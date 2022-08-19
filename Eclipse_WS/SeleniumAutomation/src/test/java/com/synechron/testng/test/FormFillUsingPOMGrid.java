package com.synechron.testng.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.synechron.selenium.training.utils.ConfigReader;
import com.synechron.testng.TestData;
import com.synechron.testng.page.FormPage;

public class FormFillUsingPOMGrid {

	WebDriver driver = null;
	
	FormPage fPage = null;
	
	ExtentReports reports = null;
	ExtentTest test = null;
	
	
	@BeforeSuite
	public void initReports() {
		reports = new ExtentReports("target\\AutomationTestReport.html");
	}
	
	
	@BeforeTest
	public void createDriver() throws MalformedURLException
	{
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.addArguments("disable-infobars");
		driver = new RemoteWebDriver(new URL("http://172.27.60.241:4444/"),options);
		
		driver.manage().timeouts().implicitlyWait(
				Duration.ofSeconds(Integer.valueOf(ConfigReader.getProperty("timeout"))));
		driver.manage().window().maximize();
	
	}
	
	@BeforeClass
	public void initializePageProperties() {
		fPage =  new FormPage(driver);
	}
	
	@BeforeMethod
	public void launch() {
		driver.get(ConfigReader.getProperty("formyurl"));
	}
	
	
	@Test(dataProviderClass =  TestData.class , dataProvider = "testData")
	public void fillForm(String fn, String ln, String jt)
	{
		test = reports.startTest("Entering form data" + fn);
		test.log(LogStatus.INFO	, "Entering user First name " + fn);
		fPage.enterFN(fn);
		
		test.log(LogStatus.INFO	, "Entering user Last name " + ln);
		fPage.enterLN(ln);
		
		test.log(LogStatus.INFO	, "Entering user Job tot;e " + jt);
		fPage.enterJT(jt);
		
		test.log(LogStatus.INFO	, "Selecting high school ");
		fPage.selectHighSchool();
		fPage.selectGender("male");
		fPage.clickSave();
		test.log(LogStatus.PASS, "TEST PASSED");
		reports.endTest(test);
		}
	
	@AfterSuite
	public void saveReports() {
		reports.flush();
		
	}
}
