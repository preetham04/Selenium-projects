package org.way2automation.tests;

import org.testng.annotations.Test;
import org.way2automation.pages.SlideBar;
import org.way2automation.util.BaseClass;
import org.way2automation.util.HelperClass;


//inherit invoke browser from  BaseClass
public class TestSlideBar extends BaseClass
{
	@Test
	public void validateSlideBar() throws InterruptedException
	{
		
		
		HelperClass helper = new HelperClass(driver);
		helper.login("monnappa05","Preeth34#@");// call the helper class for signing in
		Thread.sleep(5000);
		SlideBar acc = new SlideBar(driver);// call the method for SlideBar
		acc.slideBarPage();
	

}
}
	


