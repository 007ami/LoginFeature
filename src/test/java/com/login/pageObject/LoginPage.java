package com.login.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="userIdentifier")
	WebElement txtEmailorPhone;
	
	@FindBy(xpath="//div[@id='login-methods-heading-user_credentials']")
	WebElement lblPassword;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement btnMobileAppCancel;
	
	@FindBy(xpath="//h1[@class='page-title']")
    WebElement lblpageheader;
	
	@FindBy(xpath="//i[@class='ti-pencil']")
    WebElement lnkEdit;
	
	@FindBy(xpath="//div[@class='row user-identifier-row']/div/strong")
    WebElement lblphoneoremail;
	
	
	
	
	public void setEmailOrPhone(String emailorphone ) {
		txtEmailorPhone.clear();
		txtEmailorPhone.sendKeys(emailorphone);
	}
	
	public void clickPasswordlbl() {
		lblPassword.click();
	}
	
	public void setPassword(String password ) {
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickCancel() {
		btnMobileAppCancel.click();
	}
	
	public void pageHeader() {
		lblpageheader.getText();
	}
	public void clickEditEmailOrPhone() {
		lnkEdit.click();
	}
	
	public void headerphoneOrEmail() {
		lblphoneoremail.getText();
	}

}
