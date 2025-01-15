package testng.demo;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {

	
	@Test
	public void brwser() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
	}
	
}
