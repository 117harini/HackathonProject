package testCases;

import org.testng.annotations.Test;

import pageObjects.CarInsurance;
import testBase.BaseClass;

public class TC_02_Car extends BaseClass {
	
	CarInsurance obj;
	
	@Test(priority=1,groups= {"regression"})
	public void carCheck() {
		
		obj = new CarInsurance(driver);
		obj.scroll();
		obj.clickOnCarInsurance();
		logger.info("***** Car insurance is clicked *****");
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void newCarCheck() {
		
		obj = new CarInsurance(driver);
		obj.clickNewCar();
		logger.info("***** Buying a new car is clicked *****");
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void cityCheck() {
		
		obj = new CarInsurance(driver);
		obj.selectCity();
		logger.info("***** City is selected *****");
	}
	
	@Test(priority=4,groups= {"sanity"})
	public void vehicleCheck() {
		
		obj = new CarInsurance(driver);
		obj.selectVehicleNum();
		logger.info("***** Vehicle registration number is selected *****");
	}
	
	@Test(priority=5,groups= {"sanity"})
	public void brandCheck() {
		
		obj = new CarInsurance(driver);
		obj.selectBrand();
		logger.info("***** Brand is selected *****");
	}
	
	@Test(priority=6,groups= {"sanity"})
	public void modelCheck() {
		
		obj = new CarInsurance(driver);
		obj.selectModel();
		logger.info("***** Model is selected *****");
	}
	
	@Test(priority=7,groups= {"sanity"})
	public void fuelCheck() {
		
		obj = new CarInsurance(driver);
		obj.selectFuel();
		logger.info("***** Fuel is selected *****");
	}
	
	@Test(priority=8,groups= {"regression"})
	public void nameCheck() {
		
		obj = new CarInsurance(driver);
		obj.fillName();
		logger.info("***** Name is given *****");
	}
	
	@Test(priority=9,groups= {"regression"})
	public void emailCheck() throws InterruptedException {
		
		obj = new CarInsurance(driver);
		obj.fillEmail();
		logger.info("***** Email is given *****");
		logger.info("***** Error message is captured *****");
	}
	
	@Test(priority=10,groups= {"sanity"})
	public void mobileCheck() {
		
		obj = new CarInsurance(driver);
		obj.fillMobNum();
		logger.info("***** Mobile number is given *****");
		obj.homePage();
		logger.info("***** Back to HomePage *****");
	}

}
