package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HealthInsurance;
import testBase.BaseClass;

public class TC_03_Health extends BaseClass {
	
	HealthInsurance obj;
	
	@Test(priority=1,groups= {"regression"})
	public void healthCheck() throws InterruptedException {
		
		obj = new HealthInsurance(driver);
		obj.clickOnInsuranceProducts();
		logger.info("***** Insurance Products is hovered *****");
	}
	
	@Test(priority=2,groups= {"regression"})
	public void menuItemsCheck() throws IOException {
		
		obj = new HealthInsurance(driver);
		obj.displayMenuItems();
		logger.info("***** All menu items are displayed *****");
	}

}
