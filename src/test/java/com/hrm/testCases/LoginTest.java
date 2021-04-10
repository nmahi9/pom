package com.hrm.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hrm.config.BaseClass;
import com.hrm.config.BrowserLaunch;
import com.hrm.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void validateLoginPage() {
		WebDriver driver = BrowserLaunch.openBrowser("chrome", "http://apps.qaplanet.in/hrm/login.php");
		LoginPage log = new LoginPage(driver);
		log.pageIsOpened();
		log.validateUserNamePassword();
		log.logIntoApplication("qaplanet1", "lab1");
		
	}

}
