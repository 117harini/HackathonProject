package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	public Properties P;
	
	
	@BeforeTest
	@Parameters({"os","browser"})
	public void setup(String os, String browserName) throws IOException {
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		P = new Properties();
		P.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		
		if(P.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("windows")) {
				cap.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac")) {
				cap.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No Matching OS");
			}
			
			switch(browserName.toLowerCase()) {
			case "chrome" :
				cap.setBrowserName("chrome");
				break;
			case "edge" :
				cap.setBrowserName("MicrosoftEdge");
				break;
			default :
				System.out.println("No matching browswer");
				return;
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		}
		
		else if(P.getProperty("execution_env").equalsIgnoreCase("local")) {
		
			switch(browserName.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver(); 
				break;
			case "edge":
				driver = new EdgeDriver(); 
				break;
			default:
				System.out.println("No Browser Match");
				return;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(P.getProperty("appURL"));
		logger.info("***** Website launched successfully *****");

		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		logger.info("***** Browser closed successfully *****");
	}
	
	public String captureScreen(String name) {
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\" + name + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	

}
