package Utilis;

import cucumber.api.java.en.Given;

public class Test1 {
	

@Given("^Show A value$")
public void show_A_value() throws Exception {
   System.out.println("A"+ 8);
}

@Given("^Show B Values$")
public void show_B_Values() throws Exception {
   System.out.println("B"+ 10);
}

	

}
