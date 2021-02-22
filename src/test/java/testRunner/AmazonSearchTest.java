package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/Feature/Amazon_Search.feature"},
			glue = {"stepdefinition", "myHooks"},
			plugin = {"pretty"}
		
		)


public class AmazonSearchTest {

	//make sure u have proper class name 
	// while executing from mvn it will provide proper output
	
}
