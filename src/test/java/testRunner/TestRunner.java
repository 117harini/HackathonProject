package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//featureFiles"},
		glue="stepDefinitions",
		plugin= {"pretty", "html:reports/CucucmberReport.html", 
				 "rerun:target/rerun.txt",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
		monochrome=true,
		publish=true,
		tags= "@sanity or @regression"
		
		)

public class TestRunner {

}
