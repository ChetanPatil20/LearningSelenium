package com.report;

import org.testng.ITestContext;
import org.testng.ITestResult;

import annotationDemo.Itestlistener;

public class ITestListenerDemo extends Itestlistener {

	public void onTestStart(ITestResult result) {
		ExtentReportUtils.createTest(result.getMethod().getMethodName());

	}



	public void onFinish(ITestContext context) {
		ExtentReportUtils.flushReport();
	}
}
