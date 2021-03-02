package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src/test/resources/Feature/registrations.feature",
		glue = {"stepdefinition"},        // "myHooks"
		tags = "@smoke",
		plugin = {"pretty",
				     "json: target/MyReports/report.json",
				"junit: target/MyReports/report.xml"
		},
		publish = false,       // this will generate report link on the console
		dryRun = false,         // this will check all the steps in feature file
		monochrome = false,      // this for better allignment in console 
		strict = true  //this already deprecated in cucumber 6.9 purpose of this is used to be 
		               // if any steps missing from feature file by doing strinct = false we can skip it 
		               //but now we can use only for strict = true 
	)	
		

public class UserRegistartionTest {

}
