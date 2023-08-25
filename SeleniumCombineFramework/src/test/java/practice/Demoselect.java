package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.WebdriverUtility;

public class Demoselect {
	
		public static void main(String[] args)  {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/example.html");
			WebdriverUtility utility=new WebdriverUtility();
			utility.handlingDropDown(driver.findElement(By.id("s1")),3);
			
		}	
}
