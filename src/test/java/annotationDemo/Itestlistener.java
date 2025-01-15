package annotationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Itestlistener {

	
	public void loginToApplication() throws InterruptedException {
		// Launch browser
				
				ChromeDriver driver = new ChromeDriver();

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
}
