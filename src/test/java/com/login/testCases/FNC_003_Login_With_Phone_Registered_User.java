package com.login.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.pageObject.LoginPage;

public class FNC_003_Login_With_Phone_Registered_User extends BaseClass {
	
	
	@Test
	public void loginTestwithphone() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("+639955342876");
		logger.info("User Enter Phone");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
		lp.clickCancel();
		logger.info("Cancel Mobile App Login");
		
		lp.clickPasswordlbl();
		logger.info("Click on Password Header");
		
		lp.setPassword("Amit@321");
		logger.info("User enter password");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-title']")));
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		logger.info("Title Printed");
		String expTitle = "Account Overview - Paysera";
	
		
		if(actTitle.equals(expTitle)) 
		{
			Assert.assertTrue(true);
			logger.info("User Login Successfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("User is not login");
		}
	}
	
	@Test
	public void loginTestwithemail() throws Throwable 
	{
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailOrPhone("amitpachaury@gmail.com");
		logger.info("User Enter email");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		System.out.println("There is no way to register with Email through App");
		
		/*
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
		lp.clickCancel();
		logger.info("Cancel Mobile App Login");
		
		lp.clickPasswordlbl();
		logger.info("Click on Password Header");
		
		lp.setPassword("Amit@321");
		logger.info("User enter password");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-title']")));
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		logger.info("Title Printed");
		String expTitle = "Account Overview - Paysera";
	
		
		if(actTitle.equals(expTitle)) 
		{
			AssertJUnit.assertTrue(true);
			logger.info("User Login Successfully");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			logger.info("User is not login");
		}
		*/
	}

}
