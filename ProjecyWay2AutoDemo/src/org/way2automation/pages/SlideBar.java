package org.way2automation.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SlideBar {


	WebDriver driver;	
	 
	public SlideBar(WebDriver driver)
	{
		
		this.driver = driver;
	}

	public void slideBarPage() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click();//click on widget in home page
	    Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[5]/a")).click();//select Slidebar from the drop down
		driver.switchTo().frame(0);//switch to frame 1 based on insdexing - starts with [0]
    	WebElement slider = driver.findElement(By.xpath(".//*[@id='slider-range-max']/span"));//select the block that moves up-down the x axis
	    assertTrue(slider.isDisplayed());
	    
	    Dimension dim = slider.getSize();//get the dimensions using Dimension class
	    int x = dim.getWidth();//get the width of the x axis
	    System.out.println("Width     " + x);
	    Actions action = new Actions(driver);//use Actions class to slide down the slidebar
	   // action.moveToElement(slider).moveByOffset(x-10, 0).build().perform();
		action.dragAndDropBy(slider,100, 0).build().perform();
        
	    driver.switchTo().defaultContent();
		
	}	
		
		
	}
