package org.way2automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperClass {
	
WebDriver driver;
	
	public HelperClass(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	 public void login( String username, String password)
	 {
		//List<WebElement> box =driver.findElements(By.xpath("//ul[@id='toggleNav']/li[3]/a/following-sibling::ul/li "));
		//System.out.println("the total number of Widgets in the page are ::" + box.size());
		
		driver.findElement(By.xpath("//a[text() = 'Signin']")).click();
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'username']")).sendKeys("monnappa05");
		
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'password']")).clear();
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'password']")).sendKeys("Preeth34#@");
				
		driver.findElement(By.xpath("//div[@id = 'login']//input[@class = 'button']")).click();
	}
 
	
}


