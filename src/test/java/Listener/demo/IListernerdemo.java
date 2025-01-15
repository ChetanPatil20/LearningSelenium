package Listener.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IListernerdemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test cae : " +result.getName()+ "test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cae : " +result.getName()+ "test success ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cae : " +result.getName()+ "test failed ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cae : " +result.getName()+ "test skkiped ");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test cae : " +context.getCurrentXmlTest()+ "is started ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All the test cases are executed and finish ");
	}

}
