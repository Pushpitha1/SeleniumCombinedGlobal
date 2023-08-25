package listernersp;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo.class)

public class TestcaseListner {
   @Test
   public void demoForListner() {
	   System.out.println("done from testcase");
		   
   }
   
   @Test
   public void demoForListnerMethods() {
	   System.out.println("demoForListnerMethods");
	   assertFalse(true);// to stop
   }
}
   

