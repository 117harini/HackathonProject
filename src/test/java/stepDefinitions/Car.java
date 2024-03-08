package stepDefinitions;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarInsurance;

public class Car {
	
	CarInsurance car_obj;
	
	@Given("User navigates to the home page")
	public void user_navigates_to_the_home_page() {
		
		car_obj = new CarInsurance(CucumberBaseClass.getDriver());
	}

	@When("User clicks on the car insurance")
	public void user_clicks_on_the_car_insurance() {
		
		car_obj.scroll();
		car_obj.clickOnCarInsurance();
	}

	@When("User clicks on buy a new car")
	public void user_clicks_on_buy_a_new_car() {
		
		car_obj.clickNewCar();
		CucumberBaseClass.getLogger().info("***** Buy a new car is selected *****");
	}

	@When("User selects all the car details")
	public void user_selects_all_the_car_details() {
		
		car_obj.selectCity();
		car_obj.selectVehicleNum();
		car_obj.selectBrand();
		car_obj.selectModel();
		car_obj.selectFuel();
		CucumberBaseClass.getLogger().info("***** All car details are selected *****");
	}

	@When("User enters the name")
	public void user_enters_the_name() {
		
		car_obj.fillName();
		CucumberBaseClass.getLogger().info("***** Name is given *****");
	}

	@When("User enters invalid email")
	public void user_enters_invalid_email() throws InterruptedException {
		
		car_obj.fillEmail();
		CucumberBaseClass.getLogger().info("***** Invalid email is given *****");
	}

	@When("User enters the mobile number")
	public void user_enters_the_mobile_number() {
		
		car_obj.fillMobNum();
		CucumberBaseClass.getLogger().info("***** Mobile number is given *****");
	}

	@Then("Error message is displayed")
	public void error_message_is_displayed() {
		
		CucumberBaseClass.getLogger().info("***** Error message is cpatured *****");
		car_obj.homePage();
	}

}
