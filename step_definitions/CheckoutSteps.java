package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.*;

public class CheckoutSteps{

	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
    		int bananaPrice = price;
	}

	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int arg1, String arg2) throws Throwable {
    		// Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
    		throw new PendingException();
	}

}
