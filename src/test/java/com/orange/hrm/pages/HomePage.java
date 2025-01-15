package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.orange.hrm.test.BaseTest;

public class HomePage {

	//admin link
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminlink;
	
	
	//logout
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement profilepicture;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutlink;
	
	
	public void Homepage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickonadminlink() {
		adminlink.click();
		
	}
	
	public void logoutfromapplication()  {
		PageFactory.initElements(BaseTest.driver, this);
		profilepicture.click();
		logoutlink.click();
	}

	
	
	
}
