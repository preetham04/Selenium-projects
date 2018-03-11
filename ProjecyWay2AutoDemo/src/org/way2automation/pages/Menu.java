package org.way2automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {

	WebDriver driver;	
	 

	public Menu(WebDriver driver)
	{
		
		this.driver = driver;
	}


  public void menuPage() throws InterruptedException
  {
	  driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click();// click on the widget button on home page
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[4]/a")).click(); // click on menu option from the drop down
	  driver.switchTo().frame(0); //switch to frame 1 based on indexing  -  frame index starts with 0
	  List<WebElement> menuList = driver.findElements(By.xpath("//ul[@id = 'menu']")); //get a list of all items in menu from "Simple Menu"
	 
	  for(WebElement e: menuList) {
		  
		  String menuItems = e.getText();
		  System.out.println("Simple Menu::::::::"  + menuItems); // print the items from "Simple Menu"
	  }
	  driver.switchTo().defaultContent();
	  Thread.sleep(5000);
	 
	  String expItem = "Adamsville"; // check for sub menu
	  driver.findElement(By.xpath(".//*[@id='wrapper']/div/div[1]/div[1]/ul/li[2]/a")).click(); // click on the button "menu with sub menu"
	 // Thread.sleep(5000);
	  driver.switchTo().frame(1); //switch to frame 2 by indexing 
	  List<WebElement> menuList2 = driver.findElements(By.xpath("//ul[@id = 'menu']/li"));// select all the items in the menu List
	  System.out.println("-------------------------------------------------------------------");
	  
	  for(int i=0;i<menuList2.size();i++)
	  {
		  if(menuList2.get(i).getText().equals(expItem))
		  {
			  menuList2.get(i).click();
			   // get the list from submenu of expItem
			  System.out.println("SubMenu for"+expItem);
			  List<WebElement> subMenu1 = driver.findElements(By.xpath("//ul[@id = 'menu']/li[@id = 'ui-id-2']/ul/li"));
			  for(WebElement e : subMenu1)
			  {
				  String menuText1 = e.getText();
				   System.out.println(menuText1);
				  		
			  }		 
}
		  
	  }
	  driver.switchTo().defaultContent();
	  
  }
}
