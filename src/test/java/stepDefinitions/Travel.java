package stepDefinitions;

import java.io.IOException;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TravelInsurance;

public class Travel {
	
	TravelInsurance travel_obj;
	
	
	@Given("User opens the browser and navigates to the home page")
	public void user_opens_the_browser_and_navigates_to_the_home_page() {
		
		travel_obj = new TravelInsurance(CucumberBaseClass.getDriver());
	}

	@When("User clicks on the travel insurance")
	public void user_clicks_on_the_travel_insurance() {
		
		travel_obj.scroll();
		travel_obj.clickOnTravelInsurance();
	}

	@When("User selects the location and choose the date")
	public void user_selects_the_location_and_choose_the_date() {
		
		travel_obj.clickCountryInput();
		travel_obj.selectUK();
		CucumberBaseClass.getLogger().info("***** Country is selected *****");
		travel_obj.clickDateInput();
		travel_obj.selectStartDate();
		travel_obj.selectEndDate();
		CucumberBaseClass.getLogger().info("***** Travel date is selected *****");
	}

	@When("User selects the no.of travellers and their age")
	public void user_selects_the_no_of_travellers_and_their_age() {
		
		travel_obj.selectnoOfTravellers();
		travel_obj.selectAge();
		CucumberBaseClass.getLogger().info("***** Travellers and age is given *****");
	}

	@When("User selects no and enters the mobile number")
	public void user_selects_no_and_enters_the_mobile_number() throws InterruptedException {
		
		travel_obj.selectNo();
		travel_obj.enterMobileNo();
		CucumberBaseClass.getLogger().info("***** Mobile number is given *****");
		
	}

	@When("User selects the student plan and choose travellers")
	public void user_selects_the_student_plan_and_choose_travellers() throws InterruptedException {
		
		travel_obj.selectPlan();
		travel_obj.travellers();
		travel_obj.selectDays();
		travel_obj.clickApply();
		CucumberBaseClass.getLogger().info("***** Student plan is selected *****");
		travel_obj.sortBy();
	}

	@Then("First three travel plans are displayed")
	public void first_three_travel_plans_are_displayed() throws IOException {
		
		travel_obj.displayPlans();
		CucumberBaseClass.getLogger().info("***** Travel plans are displayed *****");
		travel_obj.homePage();
	}

}
