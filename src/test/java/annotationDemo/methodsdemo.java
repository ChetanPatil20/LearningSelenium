package annotationDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class methodsdemo {

	
	//login -->search & add to cart --> logout
	
	//login --> search & remove -->logout
	
	@BeforeMethod
	public void login() {
		System.out.println("login is completed");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("loginout is completed");
	}
	@Test
	public void Addcart() {
		System.out.println("Item added to cart");
	}
	
	
	@Test
	public void Removecart() {
		System.out.println("Item removed from cart");
	}
}
