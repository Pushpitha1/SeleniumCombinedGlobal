package leads;

import org.testng.annotations.Test;

import generics.BaseClass;

public class FT_Lead_02_Test extends BaseClass {
@Test
	
	public void Creating_lead_from_dropdown() throws InterruptedException {
		dropdown.getQuick_create().click();
		 //lead.getDrop().click();
		dropdown.getAssignTo();
		dropdown.getFirstname().sendKeys("A");
		dropdown.getLastname().sendKeys("harsh");
		dropdown.getPhoneNumber().sendKeys("2345678901");
		
		Thread.sleep(2000);
	}

}
