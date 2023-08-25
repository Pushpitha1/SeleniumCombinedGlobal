package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//img[@style=\'padding: 0px;padding-left:5px'])[1]")
	private WebElement administratorIcon;
	@FindBy(linkText="Sign Out")
	private WebElement SignOutButton;
	
	public WebElement getAdministratorIcon() {
		return administratorIcon;
		}
	public WebElement getSignOutButton() {
		return SignOutButton;
	}
	// public void loggingOut() {
		// getUserDropdownIcon().click();
		 //getLogoutButton().click();
	 }
	
	
	


