package com.orange.hrm.test;



import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class LoginTest extends BaseTest {

	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		
		
		LoginPage loginpage = new LoginPage();
		//loginpage.loginToApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1, 1) );
		
		loginpage.loginToApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"));
		
		
	}
}
