package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddInformationPage {
	 public AddInformationPage(WebDriver driver)  {
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(name="accountname")
	 private WebElement Org_name;
	 
	 @FindBy(name="tickersymbol")
	 private WebElement ticker;
	 
	 @FindBy(name="phone")
	 private WebElement phonenumber;
	 
	 @FindBy(name="button")
	 private WebElement save_button;
	 
	 public WebElement getOrg_name() {
		 return Org_name;
		 
	 }
	 
	 public WebElement getTicker() {
		 return ticker;
		 
	 }
	 public WebElement getPhonenumer() {
		 return phonenumber;
	 }
	 public WebElement getSave_button() {
		 return save_button;
	 }
	 
	
}
