package org.way2automation.tests;

import org.testng.annotations.Test;
import org.way2automation.pages.Accordion;
import org.way2automation.util.BaseClass;
import org.way2automation.util.HelperClass;



// inherit invoke browser from  BaseClass
public class TestAccordion extends BaseClass {
	
	@Test
	public void validateAccordion() throws InterruptedException
	{
		
		
		HelperClass helper = new HelperClass(driver);
		helper.login("monnappa05","Preeth34#@"); // call the helper class for signing in
		Thread.sleep(5000);
		Accordion acc = new Accordion(driver); // call the method for Accordion
		acc.AccordionPage();
		
		
		
	}

}

