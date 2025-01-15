package testng.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Multipleclass {
	
	@Test
	public void time() throws InterruptedException {
		
		Thread.sleep(3000);
		xmlfile.driver.findElement(By.xpath("//a[@href='/web/index.php/time/viewTimeModule\']")).click();
		
		Thread.sleep(3000);
		xmlfile.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Rokey");
		
		Thread.sleep(2000);
		xmlfile.driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
