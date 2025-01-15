package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataannotation {

	@Test (dataProvider = "getTestData")
	public void loginToApplication(String username, String password) throws InterruptedException {
		// Launch browser
				
				ChromeDriver driver = new ChromeDriver();

				// open login page

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				Thread.sleep(5000);
				// enter username

				driver.findElement(By.name("username")).sendKeys(username);

				// enter password

				driver.findElement(By.name("password")).sendKeys(password);

				// click on login button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
			

	}


	
@DataProvider
public Object [] [] getTestData(){

	Object [] [] data = new Object [2] [2];
	data [0] [0] ="Admin";
	
	data [0] [1] ="admin123";
	
	data [1] [0] ="SuperAdmin";
	
	data [1] [1] ="Test@123";
	return data;
	
	
	
}	

}