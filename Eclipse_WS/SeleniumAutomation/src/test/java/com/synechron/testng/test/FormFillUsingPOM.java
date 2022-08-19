package com.synechron.testng.test;

import java.time.Duration;

import org.bouncycastle.math.ec.ECCurve.Fp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Repository;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.synechron.selenium.training.utils.ConfigReader;
import com.synechron.testng.TestData;
import com.synechron.testng.page.FormPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillUsingPOM {

	WebDriver driver = null;
	
	FormPage fPage = null;
	
	ExtentReports reports = null;
	ExtentTest test = null;
	
	
	@BeforeSuite
	public void initReports() {
		reports = new ExtentReports("target\\AutomationTestReport.html");
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
