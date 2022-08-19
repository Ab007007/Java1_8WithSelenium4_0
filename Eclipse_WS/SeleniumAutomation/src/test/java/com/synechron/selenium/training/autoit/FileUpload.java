package com.synechron.selenium.training.autoit;

import java.io.IOException;

import org.openqa.selenium.By;

import com.synechron.selenium.training.utils.BrowserUtils;

public class FileUpload extends BrowserUtils
{
	static {
		try {
			Runtime.getRuntime().exec("D:\\Synechron_11_08_javaSelenium\\Eclipse_WS\\SeleniumAutomation\\autoit\\fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		driver.get("http://formy-project.herokuapp.com/fileupload");
		
		driver.findElement(By.id("file-upload-field")).click();
	}

}
