package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class CarInsurance extends BasePage {
	
	
	public CarInsurance (WebDriver driver) {
		super(driver);
		
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[4]")
	WebElement car;
	
	@FindBy(xpath = "//a[@class='btn-proceed']")
	WebElement newCar;
	
	@FindBy(xpath = "//span[@id='spn6']")
	WebElement chennai;
	
	@FindBy(xpath = "//span[text()='TN07']")
	WebElement tnNum;
	
	@FindBy(xpath = "//span[@class='volkswagen']")
	WebElement brand;
	
	@FindBy(xpath = "//span[normalize-space()='POLO GT']")
	WebElement model;
	
	@FindBy(xpath = "//span[@id='Petrol']")
	WebElement fuel;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement fullName;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//div[@class='msg-error show']")
	WebElement errorMsg;
	
	@FindBy(xpath = "//input[@id='mobileNo']")
	WebElement mobile;
	
	@FindBy(xpath = "//a[@class='pb-logo']")
	WebElement icon;
	
	@FindBy(xpath = "//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
	WebElement newCar1;
	
	@FindBy(xpath = "//span[text()='Chennai']")
	WebElement chennai1;
	
	@FindBy(xpath = "//li[text()='TN07']")
	WebElement tnNum1;
	
	@FindBy(xpath = "//span[text()='VOLKSWAGEN']")
	WebElement brand1;
	
	@FindBy(xpath = "//li[text()='POLO GT']")
	WebElement model1;
	
	@FindBy(xpath = "//li[text()='Petrol']")
	WebElement fuel1;
	
	@FindBy(xpath = "//input[@placeholder='Full name']")
	WebElement fullName1;
	
	@FindBy(xpath = "//input[@placeholder='Your email']")
	WebElement email1;
	
	@FindBy(xpath = "//div[@class='errorMsg']")
	WebElement errorMsg1;
	
	@FindBy(xpath = "//input[@placeholder='Mobile number']")
	WebElement mobile1;
	
	@FindBy(xpath = "//img[@class='img-fluid']")
	WebElement icon1;  
	
	String[] data=ExcelUtils.read();
	
	public void scroll() {
		
		js.executeScript("arguments[0].scrollIntoView();",car);
	}
	
	public void clickOnCarInsurance() {
		
		js.executeScript("arguments[0].click();",car);
	}
	
	public void clickNewCar() {
		try {
			if(icon1.isDisplayed()) {
				newCar1.click();
			}
		}
		catch(Exception e) {
			newCar.click();
		}
	}
	
	public void selectCity() {
		try {
			if(icon1.isDisplayed()) {
				chennai1.click();
			}
		}
		catch(Exception e) {
			chennai.click();
		}
	}
	
	public void selectVehicleNum() {
		try {
			if(icon1.isDisplayed()) {
				tnNum1.click();
			}
		}
		catch(Exception e) {
			tnNum.click();
		}
	}
	
	public void selectBrand() {
		try {
			if(icon1.isDisplayed()) {
				brand1.click();
			}
		}
		catch(Exception e) {
			brand.click();
		}
	}
	
	public void selectModel() {
		try {
			if(icon1.isDisplayed()) {
				model1.click();
			}
		}
		catch(Exception e) {
			model.click();
		}
	}
	
	public void selectFuel() {
		try {
			if(icon1.isDisplayed()) {
				fuel1.click();
			}
		}
		catch(Exception e) {
			fuel.click();
		}
	}
	
	public void fillName() {
		try {
			if(icon1.isDisplayed()) {
				js.executeScript("arguments[0].click();",fullName1);
				fullName1.sendKeys(data[0]);
			}
		}
		catch(Exception e) {
				js.executeScript("arguments[0].click();",fullName);
				fullName.sendKeys(data[0]);
		}
	}
	
	public void fillEmail() throws InterruptedException {
		try {
			if(icon1.isDisplayed()) {
				js.executeScript("arguments[0].click();",email1);
				email1.sendKeys(data[1]);
				Thread.sleep(10000);
			}
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();",email);
			email.sendKeys(data[1]);
		}
	}
	
	public void fillMobNum() {
		try {
			if(icon1.isDisplayed()) {
				Actions act=new Actions(driver);
				act.moveToElement(mobile1).click().perform();
				System.out.println(errorMsg1.getText());
				System.out.println();
				mobile1.sendKeys(data[2]);
			}
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();",mobile);
			System.out.println(errorMsg.getText());
			System.out.println();
			mobile.sendKeys(data[2]);
		}
	}
	
	public void homePage() {
		try {
			if(icon1.isDisplayed()) {
				icon1.click();
			}
		}
		catch(Exception e) {
			icon.click();
		}
	}
}
