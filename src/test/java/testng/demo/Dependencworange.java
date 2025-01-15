package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Dependencworange {

	
public static ChromeDriver driver ;
	
	@Test()
	public void loginToApplication() throws InterruptedException {
		// Launch browser
				Assert.assertEquals(true, true);
				 driver = new ChromeDriver();

				// open login page

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				Thread.sleep(5000);
				// enter username

				driver.findElement(By.name("username")).sendKeys("Admin");

				// enter password

				driver.findElement(By.name("password")).sendKeys("admin123");

				// click on login button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(5000);

	}
	
	
	@Test(dependsOnMethods = "loginToApplication")
	public void searchLeave() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("John");
		
	}

}
