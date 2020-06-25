package com.payseralogin.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "https://bank.paysera.com/en/login";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() 
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger= Logger.getLogger("PayseraLogin");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}

}
