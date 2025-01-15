package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsdemo {

	@Test
	public void applyleave() {
		Assert.assertEquals(true, true);
		System.out.println("Leave is applied");
	}
	
	@Test(dependsOnMethods = "applyleave")
	public void Leaveapprove() {
		System.out.println("Leave is Approved");
	}
	
}
