package testng.demo;

import org.testng.annotations.Test;

public class signup {

	//sanity
	@Test(groups = "sanity")
	public void creteaccount() {
		System.out.println("Account created");
	}
}
