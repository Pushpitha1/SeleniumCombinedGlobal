package organization;

import org.testng.annotations.Test;

import generics.BaseClass;

public class FT_Organizations_01_Test extends BaseClass {
	@Test
	
	public void Creating_an_Organization_with_valid_details() {
		organizations.getOrganizationButton().click();
		organizations.getCreateOrganizationButton().click();
		organizations.getOrganizationNameButton().sendKeys("pushpitha");
		organizations.getOtherEmailButton().sendKeys("pushpitha1993@gmail.com");
		organizations.getSaveButton().click();
		
		
		
	}
	

}
