package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class TravelInsurance extends BasePage {
	
	public TravelInsurance(WebDriver driver) {
		super(driver);
		
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	
	ExcelUtils excel = new ExcelUtils();;
	
	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[7]")
	WebElement travel;
	
	@FindBy(id = "country")
	WebElement countryInput;
	
	@FindBy(xpath = "//li[normalize-space()='United Kingdom']")
	WebElement UK;
	
	@FindBy(xpath = "//button[@class='travel_main_cta']")
	WebElement nextButton;
	
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement dateInput;
	
	@FindBy(xpath = "//button[@aria-label='Mar 15, 2024']")
	WebElement startDate;
	
	@FindBy(xpath = "//button[@aria-label='Apr 13, 2024']")
	WebElement endDate;
	
	@FindBy(xpath = "//label[text()='2']")
	WebElement two;
	
	@FindBy(xpath = "(//div[@id='divarrow_undefined'])[1]")
	WebElement age1;
	
	@FindBy(xpath = "(//div[@id='divarrow_undefined'])[2]")
	WebElement age2;
	
	@FindBy(xpath = "//label[normalize-space()='21 years']")
	WebElement age1Value;
	
	@FindBy(xpath = "//label[normalize-space()='22 years']")
	WebElement age2Value;
	
	@FindBy(xpath = "//label[text()='No']")
	WebElement medical;
	
	@FindBy(id = "mobileNumber")
	WebElement mobile;
	
	@FindBy(xpath = "//span[@class='exitIntentPopup__box__closePop']")
	WebElement close;
	
	@FindBy(xpath = "//input[@id='studentTrip']")
	WebElement studentsPlan;
	
	@FindBy(xpath = "//label[@for='Traveller_1']")
	WebElement check1;
	
	@FindBy(xpath = "//label[@for='Traveller_2']")
	WebElement check2;
	
	@FindBy(xpath = "//select[@id='feet']")
	WebElement drop;
	
	@FindBy(xpath = "//option[@value='1']")
	WebElement days;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement apply;
	
	@FindBy(xpath = "//p[@class='filter_name_heading']")
	WebElement sort;
	
	@FindBy(xpath = "//input[@value='Premium low to high']")
	WebElement value;
	
	@FindBy(xpath = "//p[@class='quotesCard--insurerName']")
	List<WebElement> companies;
	
	@FindBy(xpath = "//span[@class='premiumPlanPrice']")
	List<WebElement> prices;
	
	@FindBy(xpath = "//a[text()='Policybazaar']")
	WebElement icon;
	
	String[] data=ExcelUtils.read();
	
	public void scroll() {
		
		js.executeScript("arguments[0].scrollIntoView();",travel);
	}
	
	public void clickOnTravelInsurance() {
		
		js.executeScript("arguments[0].click();",travel);
	}
	
	public void clickCountryInput() {
		
		countryInput.click();
	}
	
	public void selectUK() {
		UK.click();
		js.executeScript("arguments[0].click();",nextButton);
	}
	
	public void clickDateInput() {
		
		dateInput.click();
	}
	
	public void selectStartDate() {
		
		js.executeScript("arguments[0].click();",startDate);
	}
	
	public void selectEndDate() {
		
		js.executeScript("arguments[0].click();",endDate);
		js.executeScript("arguments[0].click();",nextButton);
	}
	
	public void selectnoOfTravellers() {
		
		two.click();
	}
	
	public void selectAge() {
		
		age1.click();
		age1Value.click();
		age2.click();
		age2Value.click();
		js.executeScript("arguments[0].click();",nextButton);
	}
	
	public void selectNo() {
		
		medical.click();
		js.executeScript("arguments[0].click();",nextButton);
	}
	
	public void enterMobileNo() throws InterruptedException {
		
		mobile.click();
		mobile.sendKeys(data[2]);
		js.executeScript("arguments[0].click();",nextButton);
		Thread.sleep(10000);
	}
	
	public void selectPlan() {
		
		try {
			close.click();
		}
		catch(Exception e) {
			
		}
		studentsPlan.click();
	}
	
	public void travellers() {
		
		check1.click();
		check2.click();
	}
	
	public void selectDays() {
		
		drop.click();
		days.click();
	}
	
	public void clickApply() {
		
		apply.click();
	}
	
	public void sortBy() throws InterruptedException {
		
		try {
	        js.executeScript("arguments[0].click();",sort);
		}
		catch(StaleElementReferenceException e) {
				
		}
		Thread.sleep(7000);
		js.executeScript("arguments[0].click();",value);
	}
	
	public void displayPlans() throws IOException {
		
		int row=0;
		for(int i=0;i<3;i++) {
			
			System.out.println(companies.get(i).getText());
			excel.write("Sheet1", row, 0, companies.get(i).getText());
			
			System.out.println(prices.get(i).getText());
			excel.write("Sheet1", row, 1, prices.get(i).getText());
			row++;
		}
		
		System.out.println();
	}
	
	public void homePage() {
		
		icon.click();
	}
	
}
