package testRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/Feature/Amazon_Order.feature"},
			glue = {"stepdefinition"},
			plugin = {"pretty"}
		
		)

public class Amazon_OrderTest {

}
