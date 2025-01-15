package testng.demo;

import org.testng.annotations.Test;

public class Groupdemo {

	//sanity
	@Test(groups = {"Login", "sanity"})
	public void login_1() {
		System.out.println("Login 1");
	}
	@Test(groups = "Login")
	public void login_2() {
		System.out.println("Login 2");
	}
	@Test(groups = "Reset")
	public void reset_1() {
		System.out.println("Reset 1");
	}
	
	//sanity
	@Test(groups = {"Reset", "sanity"})
	public void reset_2() {
		System.out.println("Reset 2");
	}
}
