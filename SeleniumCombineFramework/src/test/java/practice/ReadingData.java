package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingData {

	@Test
	public void loginintoApp()  {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		DataBaseUtility utility = new DataBaseUtility();
		utility.establishingTheConnecton("");
		WebElement emailid=driver.findElement(By.id("Email"));
		List<String>data=utility.readingData1("select * from students:","id");
		for(String d:data)  {
			emailid.sendKeys(d);
			}
		utility.ClosingDatabase();
				
		}
}
