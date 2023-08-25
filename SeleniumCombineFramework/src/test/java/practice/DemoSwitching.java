package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generics.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSwitching {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver drivr=new ChromeDriver();
	drivr.manage().window().maximize();
	
	drivr.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String parentId=drivr.getWindowHandle();
	drivr.findElement(By.id("newWindowBtn")).click();
	String expecteTitle= "Basic Controls";
	 WebDriverUtility utility = new WebDriverUtility();
	utility.switchtowindow(drivr,parentId,drivr.getWindowHandles(),expecteTitle);
	
	utility.switchBackToMainwindow(drivr,parentId);
	drivr.close();
	
}
}
