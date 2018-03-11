package org.way2automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	
	protected WebDriver driver;
	
	@Parameters({"browserType","url"})
	@Test
	public void invokeBrowser(String browserType, String url)  {
	
		if(browserType.equals("CH"))
	     {
	    	 
	     System.setProperty("webdriver.chrome.driver","ChromeDriver.exe");
	 	 driver = new ChromeDriver();    
	     }      	
	driver.get(url);
	}
}

