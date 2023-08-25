package generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernerImplementation implements ITestListener {
	public ExtentReports report;
	public static ExtentTest Logger;
	
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/execute.html");
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
	     report= new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform","windows");
		report.setSystemInfo("author","ram");
		
	}
	public void onTestStart(ITestResult result) {
		Logger=report.createTest(result.getName());
		}
	

	public void onTestSuccess(ITestResult result) {
		Logger.log(Status.PASS, "This test case"+result.getName()+"is success");
	}

	public void onTestFailure(ITestResult result) {
		Logger.log(Status.FAIL, "This test case"+result.getName()+"is failed");
		Logger.addScreenCaptureFromPath("D:\\ecl\\SeleniumCombineFramework\\reports\\selenium.html");
	}

	
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
}
