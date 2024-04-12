package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Hook;

public class FirstScenarioStep {
    
    @Given("enter the website")
    public void enter_the_website() throws InterruptedException{        
        Hook.driver.navigate().to("https://automationstepbystep.com");
        WebElement menu = Hook.driver.findElement(By.id("mobile-menu"));
        assertTrue(menu.isDisplayed());        
    }

    @When("something happen")
    public void something_happen() throws InterruptedException{
        WebElement menu = Hook.driver.findElement(By.id("mobile-menu"));
        
        if (menu.isDisplayed()){
            menu.click();                                    
        }                                
    }

    @Then("this is the result")
    public void this_is_the_result(){        
        WebElement item86 = Hook.driver.findElement(By.id("menu-item-86"));
        assertTrue("Not Displayed item 86", item86.isDisplayed());

        item86.click();
        assertTrue("Wrong Title", Hook.driver.getTitle().equals("JMeter - Automation Step by Step"));
    }
}
