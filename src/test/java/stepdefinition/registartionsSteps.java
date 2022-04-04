package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registartionsSteps {

	
	
	
	@Given("User on registartion Page")
	public void user_on_registartion_page() {
	   System.out.println("User on registartion Page");
	}

	@When("User enters following regsitartion details")
	public void user_enters_following_regsitartion_details(DataTable registartion_dataTable) {
		
		
		List<List<String>> users = registartion_dataTable.asLists(String.class);
		for(List<String> regUsers : users){
		System.out.println(regUsers);
		
		}
	
	}
	@When("User enters following regsitartion details to the specific coulumns")
	public void user_enters_following_regsitartion_details_to_the_specific_coulumns(DataTable AsMapDataTable) {
	   
		//left side String String right side also has to match to String 
		List<Map<String, String>> mapUsers = AsMapDataTable.asMaps(String.class, String.class);
		
		System.out.println(mapUsers);
		
		
		for(Map<String, String> ele: mapUsers) {
			//System.out.println(ele);
			
			System.out.println("--------------------");
			
			System.out.println("FirstName - "+ele.get("FirstName"));
			System.out.println("LastName - "+ele.get("LastName"));
			System.out.println("Email - "+ele.get("Email"));
			System.out.println("City - "+ele.get("City"));
		}
		
		
	}
	

	@Then("user successfully registered")
	public void user_successfully_registered() {
	    System.out.println("user successfully registered");
	}

	
	
	
	
}
