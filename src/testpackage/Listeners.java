package testpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG listeners

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I Failed executed Listeners pass code"+result.getName());
		//You can write screenshot cases here
	}


}
