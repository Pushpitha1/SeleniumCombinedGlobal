package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class PropertyUtility implements IAutoConstants {
	
 public String readingDataPropertyFile(String Key) {
	 FileInputStream fis=null;
	 try {
		 fis=new FileInputStream(PROPERTYFILEPATH);
	 } catch(FileNotFoundException e)  {
		 e.printStackTrace();
	 }
	 Properties ppt= new Properties();
	 try {
		 ppt.load(fis);
	 } catch(IOException e) {
		 e.printStackTrace();
	 }
	 return ppt.getProperty(Key);
	 
		 
	 }
 }

