package stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registartionsSteps {

	
	
	
	@Given("User on registartion Page")
	public void user_on_registartion_page() {
	   
	}

	@When("User enters following regsitartion details")
	public void user_enters_following_regsitartion_details(DataTable registartion_dataTable) {
		
		
		List<List<String>> users = registartion_dataTable.asLists(String.class);
		for(List<String> regUsers : users){
		System.out.println(regUsers);
		
		}
	}

	@Then("user successfully registered")
	public void user_successfully_registered() {
	    
	}

	
	
	
	
}
