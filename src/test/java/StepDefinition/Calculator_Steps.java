package StepDefinition;

import java.util.*;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class Calculator_Steps {

	int result;

	@Given("I have Calculator")
	public void i_have_calculator() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside the Calculator ");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions
		result = num1 + num2;
	}

	@Then("I should have result as {int}")
	public void i_should_have_result_as(int res) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(res, result);
	}

	@When("I substract {int} and {int}")
	public void i_substract_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions
		result = num1 - num2;
	}

	@When("I add the below numbers")
	public void i_add_the_below_numbers(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {
			result = result + Integer.parseInt(dataTable.cell(i, 0));
		}
	}

	@When("I add the below numbers using List")
	public void i_add_the_below_numbers_using_list(List<Integer> numbers) {
		for(Integer num:numbers) {		
			result=result+num;		
		}
	}
	
	@When("I order below items")
	public void i_order_below_items(Map<String, Integer> pricelist) {
		
		for(String key: pricelist.keySet()) {
			result = result + pricelist.get(key);
		}
	}
	
	@When("I order below items with below quantity")
	public void i_order_below_items_with_below_quantity(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {
			int qty = Integer.parseInt(dataTable.cell(i, 1));
			int rate = Integer.parseInt(dataTable.cell(i, 2));
			result = result + qty * rate;
		} 
	}
}
