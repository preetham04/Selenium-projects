package org.way2automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Accordion 
     {
 
 WebDriver driver;	
 

	public Accordion(WebDriver driver)
	{
		
		this.driver = driver;
	}
			
	
       public void AccordionPage() throws InterruptedException {
      	 
    	 driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click();// look for the widget button on the main page and click
    	 driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[1]/a")).click();// from the drop down click on the first link "Accordion"
    	    	   
    	 driver.switchTo().frame(0);// switch to first frame by using index[0]
    	String text =  driver.findElement(By.xpath(".//*[@id='ui-id-2']/p")).getText(); // extract the text from section 1 button
    	System.out.println("Section1 Text:::::: " + text);
    	driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click(); // click on section 2
    	Thread.sleep(5000);
    	String text1 = driver.findElement(By.xpath(".//*[@id='ui-id-4']/p")).getText(); // extract the text from section 2 button
       	System.out.println("Section2 Text:::::: " +text1);
    	 driver.switchTo().defaultContent();
    	
    	 
    	 	   	 
     }

	

}
