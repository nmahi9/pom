package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrm.utils.Util;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="txtUserName")
	private WebElement input_userName;
	
	@FindBy(name="txtPassword")
	private WebElement input_password;
	
	@FindBy(name="Submit")
	private WebElement btn_logIn;
	
	String title = "OrangeHRM - New Level of HR Management";
	
	public void pageIsOpened() {
		try {
			Assert.assertTrue((driver.getTitle()).equalsIgnoreCase(title), "Page not opened properly!!!!!");
			System.out.println("Login page successfully opened");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validateUserNamePassword() {
		try {
			if(input_userName.isDisplayed()) {
				System.out.println("User name is displayed");
			}else {
				System.out.println("User name is not displayed in loginpage");
			}
			Assert.assertTrue(input_password.isDisplayed(), "Password is not displayed in loginpage");
			Assert.assertTrue(btn_logIn.isDisplayed(), "Login button is not displayed in loginpage");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void logIntoApplication(String username, String password) {
		Util.sendKeys(driver, input_userName, username, "Username");
		Util.sendKeys(driver, input_password, password, "Password");
		Util.click(driver, btn_logIn, "Login button");
		/*input_userName.sendKeys(username);
		input_password.sendKeys(password);*/
//		btn_logIn.click();
	}

}
