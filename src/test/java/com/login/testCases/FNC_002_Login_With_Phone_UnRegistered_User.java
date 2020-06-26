package com.login.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.pageObject.LoginPage;

public class FNC_002_Login_With_Phone_UnRegistered_User extends BaseClass {
	
	
	@Test
	public void loginTestWithPhone_a() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("+638855443322");
		logger.info("User Enter Phone Number");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String actErrorMsg = driver.findElement(By.xpath("//div[@role='alert']/div")).getText();
		String expErrorMsg = "The specified user could not be found";
		
		if(actErrorMsg.equals(expErrorMsg)) 
		{
			AssertJUnit.assertTrue(true);
			logger.info("Error Message is showing, Test Case Passed");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			logger.info("Error Message is not showing, Test Case Failed");
		}
	}
	@Test
	public void loginTestWithPhone_b() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("8855443322");
		logger.info("User Enter Phone Number");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String actErrorMsg = driver.findElement(By.xpath("//div[@role='alert']/div")).getText();
		String expErrorMsg = "The specified user could not be found";
		
		if(actErrorMsg.equals(expErrorMsg)) 
		{
			AssertJUnit.assertTrue(true);
			logger.info("Error Message is showing, Test Case Passed");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			logger.info("Error Message is not showing, Test Case Failed");
		}
	}
	@Test
	public void loginTestWithPhone_c() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("08855443322");
		logger.info("User Enter Phone Number");
		
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
