package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;


public class LoginPage {

	// username
	@FindBy(name = "username")
	WebElement userNameTextBox;
	
	
	
	//password
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement PasswordTextBox;
	
	
	//login button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	
	public void loginToApplication(String userName, String password) {
		userNameTextBox.sendKeys(userName);
		ExtentReportUtils.addStep("username is entered");
		
		PasswordTextBox.sendKeys(password);
		ExtentReportUtils.addStep("password is entered");
		
		loginBtn.click();
		ExtentReportUtils.addStep("login is success");
	}
}
