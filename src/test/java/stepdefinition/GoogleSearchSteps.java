package stepdefinition;

import googleImplementation.Country;
import googleImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	Country country;
	Search search;
	
	@Given("user on google search page")
	public void user_on_google_search_page() {
	   
		System.out.println("user on google search page");
	}

	@When("user search a country with the name {string} and population {string}")
	public void user_search_a_country_with_the_name_and_population(String CountryName, String population) {
	   
		System.out.println("user search a country and population with name " + CountryName + " and " + population + " million");
		
		country = new Country(CountryName, population);
		
	}
	

	@Then("Country with the name should be displayed")
	public void country_with_the_name_should_be_displayed() {
	   
		System.out.println("Country with the name should be displayed");

		search = new Search();
		String nameOfTheCountry = search.displayCoutryName(country);
		System.out.println("nameOfTheCountry " +nameOfTheCountry);
		
	}


}
