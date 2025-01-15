package Listener.demo;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class IsuitelissternerDemo implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
	
	System.out.println("suite is started : " +suite.getName());	
	}

	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("suite is ended : " +suite.getName());	
	}

}
