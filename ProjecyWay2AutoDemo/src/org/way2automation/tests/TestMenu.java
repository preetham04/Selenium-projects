package org.way2automation.tests;

import org.testng.annotations.Test;
import org.way2automation.pages.Menu;
import org.way2automation.util.BaseClass;
import org.way2automation.util.HelperClass;


//inherit invoke browser from  BaseClass
public class TestMenu extends BaseClass {

	@Test
	public void validateMenu() throws InterruptedException
	{
		
		
		HelperClass helper = new HelperClass(driver);
		helper.login("monnappa05","Preeth34#@");// call the helper class for signing in
		Thread.sleep(5000);
		Menu acc = new Menu(driver);// call the method for Menu
		acc.menuPage();
	}
}
