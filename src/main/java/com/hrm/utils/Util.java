package com.hrm.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	public static void sendKeys(WebDriver driver, WebElement ele, String text, String desc) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(text);
		System.out.println(text+" entered into "+desc);
	}
	
	public static void click(WebDriver driver, WebElement ele, String desc) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		System.out.println(desc+" clicked.");
	}

}
