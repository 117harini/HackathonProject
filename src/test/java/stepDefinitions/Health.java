package stepDefinitions;

import java.io.IOException;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HealthInsurance;

public class Health {
	
	HealthInsurance health_obj;
	
	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		
		health_obj = new HealthInsurance(CucumberBaseClass.getDriver());
	}

	
	@When("User hovers on Insurance products")
	public void user_hovers_on_insurance_products() throws InterruptedException {
		
		health_obj.clickOnInsuranceProducts();
	    
	}

	@Then("All health insurance menu items are displayed")
	public void all_health_insurance_menu_items_are_displayed() throws IOException {
		
		health_obj.displayMenuItems();
		CucumberBaseClass.getLogger().info("***** All health menu items are displayed *****");
	   
	}

}
