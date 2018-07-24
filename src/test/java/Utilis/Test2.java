package Utilis;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {
	
	
	@Given("^A (\\d+)$")
	public void a(int arg1) throws Exception {
	   
		System.out.println("Given A"+arg1);
	}

	@When("^B (\\d+)$")
	public void b(int arg1) throws Exception {
		
		System.out.println("Given B"+arg1);
	}

	@Then("^Addition of C$")
	public void addition_of_C() throws Exception {
		
		System.out.println("Pass");
		
	}



}
