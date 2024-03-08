package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class HealthInsurance extends BasePage {
	
	public HealthInsurance (WebDriver driver) {
		super(driver);
		
	}
	
	Actions act = new Actions(driver);
	
	ExcelUtils excel = new ExcelUtils();
	
	@FindBy(xpath = "(//a[@href = \"javascript:void(0)\"])[1]")
	WebElement insuranceProducts;
	
	@FindBy(xpath = "//li//div[3]/ul/li")
	List<WebElement> menuItems;
	
	public void clickOnInsuranceProducts() throws InterruptedException {
		
		act.moveToElement(insuranceProducts).perform();
		Thread.sleep(2000);
		
	}
	
	public void displayMenuItems() throws IOException {
		
		System.out.println("Health insurance menu items are:");
		System.out.println();
		int row = 0;
		for(WebElement item : menuItems) {
			String value = item.getText();
			System.out.println(value);
			excel.write("Sheet1", row, 2, value);
			row++;
		}
	}

}
