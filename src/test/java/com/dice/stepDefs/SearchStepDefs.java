package com.dice.stepDefs;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import com.dice.pages.SearchButtonPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefs {
	
	
	//Verify Search Button; 

	@Given("I am on home page")
	public void i_am_on_home_page() {
	  
	   Driver.getDriver().manage().timeouts().
	   implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
	   Driver.getDriver().manage().window().maximize();
	   Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@When("I fill in Job Title and Location")
	public void i_fill_in_job_title_and_location() {
	
		SearchButtonPage.searchForValues();
		
	}

	@Then("I should be able to click on Search Button and land on job listings page")
	public void i_should_be_able_to_click_on_and_land_on_job_listings_page() {
		
		SearchButtonPage page = new  SearchButtonPage();

		String actualText = page.emailRequestText.getText();
		String expectedText = "Email me jobs for this search";
		
		assertEquals(actualText, expectedText); 
	}
	
	

}