package leads;

import org.testng.annotations.Test;

import generics.BaseClass;

public class FT_Lead_01_Test extends BaseClass {
	@Test
	public void Creating_a_new_lead_information() {
   lead.getDrop().click();
		lead.getFirstName().sendKeys("Ram");
	lead.getLastName().sendKeys("s");
	lead.getEmailID().sendKeys("abc@gmail.com");
lead.getPhonenumber().sendKeys("6789564536");
lead.getButton().click();
}
}


