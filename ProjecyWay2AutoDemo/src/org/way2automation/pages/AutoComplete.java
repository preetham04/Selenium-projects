package org.way2automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoComplete {


	WebDriver driver;	
	 

	public AutoComplete(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
		

    public void AutoCompletePage () throws InterruptedException {
    	
    	driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click(); // find the widget button on homepage
    	Thread.sleep(5000);
    	driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[2]/a")).click(); // click on autocomlete option from the drop down
    	driver.switchTo().frame(0); //switch to frame 1 by indexing
    	driver.findElement(By.id("tags")).sendKeys("java");
    	Thread.sleep(5000);
    	List<WebElement> tableList = driver.findElements(By.cssSelector("#ui-id-1>li"));
    	 for (int i=0;i<tableList.size();i++)
    	 {
    		 if(tableList.get(i).getText().contains("JavaScript"))
    		 {
    			 tableList.get(i).click();
    			 System.out.println("Match Found");
    		 }
    		 
    	 }
    	 driver.switchTo().defaultContent();
    }
	
}