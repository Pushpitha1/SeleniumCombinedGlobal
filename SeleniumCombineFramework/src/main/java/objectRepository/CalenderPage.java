package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
		 public CalenderPage(WebDriver driver)  {
			 PageFactory.initElements(driver,this);
		 }
		 
		 @FindBy(name="calAddButton")
		 private WebElement Button;
		 
		 @FindBy(name="getSubject")
		 private WebElement Event;
		 
		 @FindBy(name="description")
		 private WebElement Description; 
		 
		
		 
		 public WebElement getdescription() {
			 return Description;
			 
		 }
		 public WebElement getSubject() {
			 return Event;
		 }
		 public WebElement getAdd_button() {
			 return Button;
		 }
		 
		
	}


