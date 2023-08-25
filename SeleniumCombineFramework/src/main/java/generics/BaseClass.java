package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CalenderPage;
//import objectRepository.Contact_CreationPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;
import objectRepository.Lead_dropdownPage;
import objectRepository.LoginPage;
import objectRepository.OrganizationPage;

public class BaseClass {
	public static WebDriver driver;
	public WebDriverUtility utility1;
	public PropertyUtility property;
	public LoginPage login;
	public HomePage home;
	public CalenderPage calender;
	public OrganizationPage organizations;
	public LeadPage lead;
	//public Contact_CreationPage contact;
	public Lead_dropdownPage dropdown;
	WebDriverUtility utility;
	
	
	
	@BeforeClass
	  public void launchingBrowser() {
		property=new PropertyUtility();  //defined as public
		utility1=new WebDriverUtility();
		
		if(property.readingDataPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(property.readingDataPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
	} else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@BeforeMethod
public void navigatingToApplication() {
	lead = new LeadPage(driver);
	login=new LoginPage(driver);
	dropdown= new Lead_dropdownPage(driver);
	organizations = new OrganizationPage(driver);
	//contact = new Contact_CreationPage(driver);
	home=new HomePage(driver);
		driver.get(property.readingDataPropertyFile("url"));
	login.loginToApplication(property.readingDataPropertyFile("username"),property.readingDataPropertyFile("password"));
}
@AfterMethod
public void signOutFromApplication() {
	login = new LoginPage(driver);
	home= new HomePage(driver);
	organizations = new OrganizationPage(driver);
	//contact = new Contact_CreationPage(driver);
	
	System.out.println("signedout");
}
@AfterClass
public void closingTheBrowser() {
	driver.quit();
}
}

	
	
	
		
		
			
			
			
		