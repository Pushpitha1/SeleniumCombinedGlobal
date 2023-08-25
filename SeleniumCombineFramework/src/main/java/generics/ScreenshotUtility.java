package generics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility implements IAutoConstants {
	

	public String takingScreenshot(WebDriver driver,String screenshotname) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String time=LocalDateTime.now().toString().replace(":","-");
		
		String path=DIRECTORY+""+SSPATH+screenshotname+" "+TIME+".png";
		File file = new File(path);
		try {
			FileUtils.copyFile(photo, file);
		}catch(IOException e)  {
			e.printStackTrace();
		}
		return path;
		
	}

}
