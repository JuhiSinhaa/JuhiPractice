package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step {

	@Given("first number")
	public void first_number() {
	   System.out.println("first number: 2 ");
	}

	@Given("2nd  number")
	public void nd_number() {
		  System.out.println("second number: 3 ");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 System.out.println("final number: 5 ");
	}

}
