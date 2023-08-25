package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	 public OrganizationPage(WebDriver driver)  {
			 PageFactory.initElements(driver,this);
		 }
		 
		 @FindBy(linkText="Organizations")
		 private WebElement OrganizationButton;
		 
		 @FindBy(xpath="//img[@alt='Create Organization...']")
		 private WebElement CreateOrganizationButton;;
		 
		 @FindBy(name= "accountname")
		 private WebElement OrganizationNameButton;
		 
		 @FindBy(id="email2")
		 private WebElement OtherEmailButton;
		 
		 @FindBy(name="button")
		 private WebElement Savebutton;
		 
		 public WebElement getCreateOrganizationButton() {
			 return CreateOrganizationButton;
			 
		 }
		 
		 public WebElement getOrganizationNameButton() {
			 return OrganizationNameButton;
			 
		 }
		 
		 public WebElement getOrganizationButton() {
			 return OrganizationButton;
			 
		 }
		 public WebElement getOtherEmailButton() {
			 return OtherEmailButton;
		 }
		 
		 public WebElement getSaveButton() {
			 return Savebutton;
		 }
		 }
		 
		


