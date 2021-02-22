package stepdefinition;

import amazonProducts.AppleProduct;
import amazonProducts.SearchProduct;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	
	AppleProduct appleproduct;
	SearchProduct searchproduct;
	
	@Given("Im on search page in Amazon")
	public void im_on_search_page_in_amazon() {
	    System.out.println("step 1 Im on search page");
		
		
	}

	@When("I search for a product name {string} and price with {int}")
	public void i_search_for_a_product_name_and_price_with(String productName, Integer price) {
		 System.out.println("step 2 Im on searching product with name " + productName + " and price " + price) ;
			
		 //when u created obj of class constr will pass with the paramater here 
		 appleproduct = new AppleProduct(productName, price);
		 
	   
	}

	@Then("Product with the Name {string} should be displayed")
	public void product_with_the_name_should_be_displayed(String productName) {
		System.out.println("product name is displayed with name " + productName);
	    
		//this is just demo Class here im creating another obj of different class
		//im assuming once i find the product i click on it and im landing 
		// different class thats class is searchproduct !
		searchproduct = new SearchProduct();
		String nameOfTheProduct = searchproduct.product_diplay(appleproduct);
		System.out.println("product name is " + nameOfTheProduct);
		
	}

	@Then("order id {int} and username is {string}")
	public void order_id_and_username_is(Integer int1, String string) {


	}


	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {


	}
	
	@When("I search for a product with name {string} and price with {int}")
	public void i_search_for_a_product_with_name_and_price_with(String string, Integer int1) {


	}

	@Then("Product Name {string} should be displayed")
	public void product_name_should_be_displayed(String string) {


	}

	@Then("order with the id {int} and username is {string}")
	public void order_with_the_id_and_username_is(Integer int1, String string) {


	}

	
	
	
	
	
	
	
	
	
	
	
	
}
