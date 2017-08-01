/**
 * 
 */
package jbehavePackage;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.testng.Reporter;

import reUsablePackage.Calculator;

/**
 * @author saikiran.nataraja
 *
 */
public class CalculatorTestSteps {

	Calculator cal;
	String result;

	@Given("two numbers")
	public void given_twoNumbers() {
		cal = new Calculator();
	}

	@When("I add the numbers")
	public void add_numbers() {
		result = String.valueOf(cal.add(10, 20));
		Reporter.log("result" + result, true);
	}

	@Then("I validate the sum of numbers")
	public void print_output() {
		Reporter.log("Test: Addition of two numbers" + result, true);
	}

}
