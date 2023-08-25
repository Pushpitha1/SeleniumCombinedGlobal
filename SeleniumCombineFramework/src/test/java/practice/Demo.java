package practice;

import org.testng.annotations.Test;
import generics.ExcelUtility;
public class Demo {
	@Test(dataProvider="test data",dataProviderClass=ExcelUtility.class)
	
	public void demo(String d, String e)  {
		System.out.println(d+""+e);
		
	}
	

}
