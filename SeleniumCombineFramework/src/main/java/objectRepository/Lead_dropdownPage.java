package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_dropdownPage {
	public Lead_dropdownPage(WebDriver driver)  {
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="qccombo")
	private WebElement Quick_create;
	
	
	@FindBy(name="firstname")
	private WebElement Firstname;
	
	@FindBy(name="lastname")
	private WebElement Lastname;
	
	@FindBy(id="email")
	private WebElement EmailTF;
	
	@FindBy(id="phone")
	private WebElement PhoneNumber;
	
	@FindBy(name="assigntype")
	private WebElement AssignTo;

	public WebElement getQuick_create() {
		return Quick_create;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getAssignTo() {
		return AssignTo;
	}
}
	
	
	
	
	
	
	
	
	
	
	


