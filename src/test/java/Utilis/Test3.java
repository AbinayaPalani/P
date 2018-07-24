package Utilis;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test3 {

//	@Given("^Read the first {float}$")
//	public void read_the_first(float arg1) throws Exception {
//		
//		System.out.println(arg1);
//	}
//
//	@When("^Read the second {float}$")
//	public void read_the_second(float arg1) throws Exception {
//		
//		System.out.println(arg1);
//	}
//
	
//	@Given("^I have {int} red balls$")
//	public void i_have_red_balls(int int1) {
//	}
//


@Given("^I have (\\d+.\\d+) red balls$")
public void i_have_red_balls(double arg) throws Exception {
    System.out.println(arg);
}

	

	
	
}
