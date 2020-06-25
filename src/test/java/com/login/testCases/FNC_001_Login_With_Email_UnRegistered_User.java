package com.payseralogin.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.payseralogin.pageObject.LoginPage;

public class FNC_001_Login_With_Email_UnRegistered_User extends BaseClass {
	
	
	@Test
	public void loginTestwithemail() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("amitpachaury@gmail.com");
		logger.info("User Enter Email");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String actErrorMsg = driver.findElement(By.xpath("//div[@role='alert']/div")).getText();
		String expErrorMsg = "The specified user could not be found";
		
		if(actErrorMsg.equals(expErrorMsg)) 
		{
			Assert.assertTrue(true);
			logger.info("Error Message is showing, Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Error Message is not showing, Test Case Failed");
		}
	}
	

}
