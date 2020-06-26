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

public class FNC_004_Verify_Edit_Icon extends BaseClass {
	
	
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
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String beforeEditPhone= driver.findElement(By.xpath("//div[@class='row user-identifier-row']/div/strong")).getText();
		System.out.println(beforeEditPhone);
		
		lp.clickEditEmailOrPhone();
		lp.setEmailOrPhone("+919782313286");
		
		lp.clickSubmit();
		logger.info("Click Login Button");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String AfterEditPhone= driver.findElement(By.xpath("//div[@class='row user-identifier-row']/div/strong")).getText();
        System.out.println(AfterEditPhone);
        
		if(!beforeEditPhone.equals(AfterEditPhone)) 
		{
			Assert.assertTrue(true);
			logger.info("Edit Successfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Edit is not Successful.");
		}
	
	}

}
