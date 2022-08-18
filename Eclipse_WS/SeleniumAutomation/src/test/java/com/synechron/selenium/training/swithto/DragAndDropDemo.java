package com.synechron.selenium.training.swithto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.selenium.training.utils.BrowserUtils;

public class DragAndDropDemo extends BrowserUtils
{
	
	public static void main(String[] args) {
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement destElement = driver.findElement(By.id("droppable"));
		
		System.out.println("Before Drag and Drop " + destElement.getText());
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, destElement).perform();
		System.out.println("After Drag and Drop " + destElement.getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
		
	}

}
