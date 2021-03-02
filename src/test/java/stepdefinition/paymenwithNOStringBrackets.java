package stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paymenwithNOStringBrackets {
	//double can handle both int ND double thats why declared int with double
	
	double billingamount;
	double taxamount;
	double finalamount;
	
	
	
	@Given("userr is on billing page")
	public void userr_is_on_billing_page() {
	   
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer billingamount) {
	   this.billingamount = billingamount;
	}

	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer taxamount) {
	   this.taxamount = taxamount;
	}
	
	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double taxamount) {
		this.taxamount = taxamount;
	}

	@When("user clickss on calculate button")
	public void user_clickss_on_calculate_button() {
	    
	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer finalamount) {
	   this.finalamount = this.billingamount + this.taxamount;
	  Assert.assertTrue(this.finalamount == finalamount);
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double finalamount) {
		  this.finalamount = this.billingamount + this.taxamount;
		  Assert.assertTrue(this.finalamount == finalamount);
	}


	



}
