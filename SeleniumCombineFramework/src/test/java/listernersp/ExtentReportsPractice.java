package listernersp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsPractice {
	public static void main(String[] args)  {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/selenium.html");//before strarting test all steps writing
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
		ExtentReports report= new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform","windows");
		report.setSystemInfo("author","ram");
		ExtentTest Logger= report.createTest("Sample Test");//after test stating writing steps
		Logger.log(Status.FAIL, "This is failed");
		Logger.log(Status.INFO, "This is informations");
		Logger.log(Status.PASS, "This is passed");
		Logger.addScreenCaptureFromPath("D:\\ecl\\Automation Testing\\WindowSS\\pic.png"); //To add screenshots
		ExtentTest Logger1=report.createTest("demo Test");
		Logger1.log(Status.FAIL, "This is failed demo");
		Logger1.log(Status.INFO, "This is informations demo");
		Logger1.log(Status.PASS, "This is passed demo");
		System.out.println("done");
		report.flush();
				
			
	}

}
