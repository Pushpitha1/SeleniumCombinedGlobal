package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
			 public LeadPage(WebDriver driver)  {
			 PageFactory.initElements(driver,this);
		 }
			 @FindBy(name="salutationtype")
			 private WebElement drop;
			  
			 @FindBy(id="qccombo")
			 private WebElement Quick_create;
		 
		 @FindBy(name ="firstname")
		 private WebElement FirstName;
		 
		 @FindBy(name="lastname")
		 private WebElement LastName;
		 
		 @FindBy(name="phone")
		 private WebElement Phonenumber; 
		 
		 @FindBy(name="email")
		 private WebElement EmailID;
		 
		 @FindBy(name="button")
		 private WebElement Button;
		 
		 public WebElement getDrop() {
				return drop;
		 }
		 public WebElement getQuick_create() {
				return Quick_create;
			}

		public WebElement getFirstName() {
			return FirstName;
		}

		public WebElement getLastName() {
			return LastName;
		}

		public WebElement getPhonenumber() {
			return Phonenumber;
		}

		public WebElement getEmailID() {
			return EmailID;
		}

		public WebElement getButton() {
			return Button;
		}
		
	}




