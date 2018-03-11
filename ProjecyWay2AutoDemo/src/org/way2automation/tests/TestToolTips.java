package org.way2automation.tests;

import org.testng.annotations.Test;
import org.way2automation.pages.ToolTips;
import org.way2automation.util.BaseClass;
import org.way2automation.util.HelperClass;


//inherit invoke browser from  BaseClass
public class TestToolTips extends BaseClass {

	@Test
	public void validateToolTips() throws InterruptedException
	{
		
		
		HelperClass helper = new HelperClass(driver);
		helper.login("monnappa05","Preeth34#@");// call the helper class for signing in
		Thread.sleep(5000);
		ToolTips acc = new ToolTips(driver);// call the method for ToolTips
		acc.ToolTipsPage();












	}


}

