package org.way2automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTips {

	WebDriver driver;	
	 

	public ToolTips(WebDriver driver)
	{
		
		this.driver = driver;
	}


public void ToolTipsPage () throws InterruptedException
{
	
	driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click();//click on widget button home page
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[7]/a")).click();// select ToolTips from the drop down
	driver.switchTo().frame(0);//switch to frame 1 based on indexing
	driver.findElement(By.id("age")).click();//select the textbox
	
	//use Actions class for extracting the tooltip message
	 Actions action = new Actions(driver);
	 //move to the box containing the tooltip message
	 action.moveToElement(driver.findElement(By.xpath("//body//div[@class = 'ui-helper-hidden-accessible']/div[1]")));
     action.perform();
     String toolTip = driver.findElement(By.xpath("//body//div[@class = 'ui-helper-hidden-accessible']/div[1]")).getText();//get the tooltip message
     System.out.println("Tooltip message is ::::  " + toolTip);
     String exp_ToolTip = "We ask for your age only for statistical purposes.";
     Assert.assertEquals(toolTip,exp_ToolTip);//verifying the tooltip message
     System.out.println("Message Verified"); 
     System.out.println(""); 
     driver.switchTo().defaultContent();
}
}
