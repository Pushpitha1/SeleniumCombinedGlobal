package listernersp;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on test start "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on sucess "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test failed "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on testskipped "+result.getName());
	}

	
	public void onStart(ITestContext context) {
		System.out.println("on test start "+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("on Finish "+context.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

	


