package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioStep {
    
    @Given("enter the website")
    public static void enter_the_website(){
        assertEquals(0, 0);
    }

    @When("something happen")
    public static void something_happen(){
        assertEquals(0, 0);
    }

    @Then("this is the result")
    public static void this_is_the_result(){
        assertEquals(0, 0);
    }
}
