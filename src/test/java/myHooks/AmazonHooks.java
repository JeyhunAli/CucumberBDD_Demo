package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	
	//we can define here which tagged scenario to execute
	@Before("@smoke")
	public void setUp_browser(Scenario sc) {
		
		System.out.println("Lounch the browser");
		System.out.println("ScenarioName "+sc.getName());
		System.out.println("ScenarioStatus "+sc.getStatus());
		System.out.println("ScenarioId "+sc.getId());

	}
		
	
// this @Before annotations i mean hooks will execute before stepdefinition as precondition
	@Before(order = 2)
	public void setUp_url() {
		
		System.out.println("Lounch the url");
		
	}
	
	// this @After annotations i mean hooks will execute after stepdefinition as precondition
	@After(order = 2)
	public void tearDown_browser() {
		
		System.out.println("close the browser");
	}
	
	
	//we can define here which tagged scenario to execute
	@After("sanity")
	public void tearDown_logout() {
		
		System.out.println("logOut");
	}

	
	//this method will run before every step from feature file
		@BeforeStep
		public void takeScreenShot() {
			System.out.println("taking screen shot before every step");
		}

		//this method will run after every step from feature file
		@AfterStep
		public void refresh_the_page() {
			System.out.println("refreshing the page after each step");
		}
		
	
	
}

//we can jave multiple before and after annotations 
// we can pass Scenario with the ref name with that name we can get name, of that scenario status, line, id 





