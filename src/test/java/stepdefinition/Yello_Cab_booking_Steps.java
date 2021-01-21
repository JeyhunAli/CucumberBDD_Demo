package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConsoleColors;

public class Yello_Cab_booking_Steps {
	

	@Given("User selecting car type {string} from Yellow cab application")
	public void user_selecting_car_type_from_yellow_cab_application(String carType) {
       System.out.println( ConsoleColors.ORANGE +"User selecting car type  " + carType);

	}

	@When("User choose car type {string} pick up point {string} and drop off location {string}")
	public void user_choose_car_type_pick_up_point_and_drop_off_location(String charType, String pickupLocation, String dropoffLocation) {
      System.out.println(ConsoleColors.BROWN +"User choose car type " + charType + " pick up point "+ pickupLocation +" and drop off location "+ dropoffLocation);

	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
    System.out.println(ConsoleColors.BANANA_YELLOW +"driver starts the journey");

	}

	@Then("driver ends the Jorney")
	public void driver_ends_the_jorney() {
     System.out.println(ConsoleColors.DARK_BLUE + "driver ends the Jorney");

	}

	@Then("user pays {int} usd dollar")
	public void user_pays_usd_dollar(Integer amount) {
    System.out.println(ConsoleColors.GREEN + "user pays " + amount + " usd dollar");

	}

	

}
