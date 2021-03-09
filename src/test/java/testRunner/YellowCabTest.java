package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/Feature/yellow_cab.feature"},
			glue = {"stepdefinition"},
			tags = "@All",
			plugin = {"pretty"}
		
		)
public class YellowCabTest {





	
}




//make sure u have proper class name 
	// while executing from mvn it will provide proper output
	