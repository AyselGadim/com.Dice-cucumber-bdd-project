package com.dice.stepDefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.dice.pages.JobListingsPage;
import com.dice.pages.SearchButtonPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobInfoStepDefs {
	
	//verify job title

	@Given("I am on job listings page")
	public void i_am_on_job_listings_page() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));

		SearchButtonPage.searchForValues();
		com.dice.utilities.BrowserUtilities.waitForPageToLoad(15);
	    
	}

	@When("I click on job title")
	public void i_click_on() {
		
		JobListingsPage page = new JobListingsPage();
		page.jobTitle.click();	
	  
	}

	@Then("The job title should be correct on job description page")
	public void the_should_be_correct_on_job_description_page() {
		
		
		JobListingsPage page = new JobListingsPage();
		String actual = page.descriptionJobTitle.getText();
		String expected = page.jobTitle.getText();
		assertTrue(actual.contains(expected));
	}
	
	//verify apply now button

	@Then("I should land on job description page and it should contain Apply Now Button")
	public void i_should_land_on_job_description_page_and_it_should_contain_button() {
		JobListingsPage page = new JobListingsPage();
		String actual = page.applyNowButton.getText();
		String expected = "Apply Now"; 
		assertTrue(actual.contains(expected));
	}
	
	//verify job id
	
	
	

	@Then("I should land on job description page and it should contain Job ID")
	public void i_should_land_on_job_description_page_and_it_should_contain_job_id() {
		
		JobListingsPage page = new JobListingsPage();
		page.diceID.getText(); 
		String actual = page.diceID.getText();
		String expected = "Dice Id"; 
		assertTrue(actual.contains(expected));
		
		
	}
	
	//verify share button
	
	@Given("I am on job description page")
	public void i_am_on_job_description_page() {
		
	Driver.getDriver().get(ConfigReader.getProperty("url"));

	SearchButtonPage.searchForValues();
	
	JobListingsPage page = new JobListingsPage();
	page.jobTitle2.click();
		  
	}
	
	@When ("I click on Share Button")
	public void i_click_on_share_button() {
		JobListingsPage page = new JobListingsPage();
		page.shareButton2.click();
	}
	
	@Then("I should get Email option")
	public void i_should_get_email_option() {
		JobListingsPage page = new JobListingsPage();
		page.emailButton.click();
		String actual = page.emailThisJob.getText();
		String expected = "Email this Job";
		assertEquals(actual, expected); 
		
	   
	}

	
	//verify apply now button
	

	@When("I click on Apply Now Button")
	public void i_click_on_button() {
		JobListingsPage page = new JobListingsPage();
		page.applyNowButton.click();
	    
	}

	@Then("I should get a pop up icon which contains Sign In Button")
	public void i_should_get_a_pop_up_icon_which_contains() {
		JobListingsPage page = new JobListingsPage();
		String actual = page.signInButton.getText();
		String expected = "Sign In"; 
		assertTrue(actual.contains(expected));
	    
	}

	




}
