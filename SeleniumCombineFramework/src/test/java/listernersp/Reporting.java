package listernersp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generics.ListernerImplementation;

public class Reporting {
	@Test
	public void Demo() {
		ListernerImplementation listen = new ListernerImplementation();
		listen.Logger.log(Status.PASS, "it is passed");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		assertEquals(false, true);
		
		
		
		
	}
	

}
