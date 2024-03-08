package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.TravelInsurance;
import testBase.BaseClass;

public class TC_01_Travel extends BaseClass {
	
	TravelInsurance obj;
	
	@Test(priority=1,groups= {"regression"})
	public void travelCheck() {
		obj = new TravelInsurance(driver);
		obj.scroll();
		obj.clickOnTravelInsurance();
		logger.info("***** Travel Insurance is clicked *****");
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void countryCheck() {
		
		obj = new TravelInsurance(driver);
		obj.clickCountryInput();
		obj.selectUK();
		logger.info("***** Country is selected *****");
	}
	
	@Test(priority=3,groups= {"regression"})
	public void dateCheck() {
		
		obj = new TravelInsurance(driver);
		obj.clickDateInput();
		obj.selectStartDate();
		obj.selectEndDate();
		logger.info("***** Travel dates are selected *****");
	}
	
	@Test(priority=4,groups= {"sanity"})
	public void ageCheck() {
		
		obj = new TravelInsurance(driver);
		obj.selectnoOfTravellers();
		obj.selectAge();
		logger.info("***** Travellers and their ages are selected *****");
	}
	
	@Test(priority=5,groups= {"sanity"})
	public void medicalCheck() {
		
		obj = new TravelInsurance(driver);
		obj.selectNo();
		logger.info("***** No medical issues is given *****");
	}
	
	@Test(priority=6,groups= {"sanity"})
	public void mobileCheck() throws InterruptedException {
		
		obj = new TravelInsurance(driver);
		obj.enterMobileNo();
		logger.info("***** Mobile number is given *****");
	}
	
	@Test(priority=7,groups= {"regression"})
	public void travellerCheck() {
		
		obj = new TravelInsurance(driver);
		obj.selectPlan();
		logger.info("***** Student plan is selected *****");
		obj.travellers();
		logger.info("***** Travellers are selected *****");
		obj.selectDays();
		logger.info("***** No.of days is selected *****");
		obj.clickApply();
		logger.info("***** Apply button is clicked *****");
	}
	
	@Test(priority=8,groups= {"regression"})
	public void planCheck() throws InterruptedException, IOException {
		
		obj = new TravelInsurance(driver);
		obj.sortBy();
		obj.displayPlans();
		logger.info("***** All plans are displayed *****");
		obj.homePage();
		logger.info("***** Back to HomePage *****");
	}
	
}
