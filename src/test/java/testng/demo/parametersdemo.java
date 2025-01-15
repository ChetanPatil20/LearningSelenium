package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersdemo {

	@Parameters({"username", "password"})
	@Test
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
				Thread.sleep(5000);

	}
	
}
