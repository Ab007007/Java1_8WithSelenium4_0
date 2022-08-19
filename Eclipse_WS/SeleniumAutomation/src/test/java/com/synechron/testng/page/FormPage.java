package com.synechron.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FormPage {

	@FindBy(id = "first-name")
	WebElement finstNameTxtBox;
	
	@FindBy(id = "last-name")
	WebElement lasttNameTxtBox;
	
	@FindBy(id = "job-title")
	WebElement jobTitleTxtBox;
	
	@FindBy(id = "radio-button-1")
	WebElement highSchool;
	
	@FindBy(id = "radio-button-2")
	WebElement college;
	
	@FindBy(id = "radio-button-3")
	WebElement gradeschool;
	
	@FindBy(id = "checkbox-1")
	WebElement maleCheckBox;
	@FindBy(id = "checkbox-2")
	WebElement femaleCheckBox;
	@FindBy(id = "checkbox-3")
	WebElement noPrefCheckBox;
	
	@FindBy(id = "datepicker")
	WebElement dataPicker;
	
	@FindBy(xpath = "//td[@class='today day']")
	WebElement selectToday;
	
	@FindBy(xpath = "//a[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement successMsg;
	
	public void enterFN(String fn)
	{
		finstNameTxtBox.sendKeys(fn);
	}
	
	public void enterLN(String fn)
	{
		lasttNameTxtBox.sendKeys(fn);
	}
	public void enterJT(String fn)
	{
		jobTitleTxtBox.sendKeys(fn);
	}
	
	public void selectHighSchool() {
		highSchool.click();
	}
	
	public void selectGender(String type)
	{
		switch (type.toLowerCase()) {
		case "male":
			maleCheckBox.click();
			break;
		case "female":
			femaleCheckBox.click();
			break;
		case "none":
			noPrefCheckBox.click();
			break;

		default:
			break;
		}
		
	}
	
	public void clickSave()
	{
		submitButton.click();
		Assert.assertEquals(successMsg.getText(), "The form was successfully submitted!");
		
	}
	
	public FormPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}
	
}
