package Listener.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;


public class Ilistner {
	RemoteWebDriver driver;
	
	@Test(priority = 1)
	public void loginToApplication() throws InterruptedException, MalformedURLException {
		// Launch browser
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username", "oauth-patilc06-bbce3");
		sauceOptions.put("accessKey", "5ae70e6b-4d34-4211-8f4e-f8bc1975ab1a");
		sauceOptions.put("build", "selenium-build-TGS9Q");
		sauceOptions.put("name", "<Sanity Test>");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
	    driver = new RemoteWebDriver(url, browserOptions);

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
	
	@Test(priority = 1)
	public void testAdmin() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
	boolean isdiplayed =	driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(isdiplayed);
	Thread.sleep(2000);
	
	}
	

	@Test(priority = 2)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	@Test(priority = 3)
	public void webclose() {
		
		driver.close();
	}
	
}
