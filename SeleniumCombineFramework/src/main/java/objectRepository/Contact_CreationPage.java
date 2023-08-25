package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_CreationPage {
	public Contact_CreationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	@FindBy(name="salutationtype")
	 private WebElement salutationTab;
	
	 @FindBy(name="firstname")
	 private WebElement FirstName;
	 
	 @FindBy(name="lastname")
	 private WebElement LastName;

	public WebElement getSalutationTab() {
		return salutationTab;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}
	 
	 
	
	

}
