package Utilis;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/resources/features/",
				tags = {"@sample"}, 
				plugin = "pretty")
public class Test {
	
	
	

}
