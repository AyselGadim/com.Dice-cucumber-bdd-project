package com.dice.stepDefs;

import org.junit.Assert;

import com.dice.pages.ContactUsPage;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepDefs {
	
	
	
	@When("I click on contact us link")
	public void i_click_on_contact_us_link() {
		ContactUsPage cup = new ContactUsPage();
		cup.contactUsLink.click();
		
	   
	}

	@Then("I should land on contact us page")
	public void i_should_land_on_contact_us_page() {
		String title = Driver.getDriver().getTitle();
		Assert.assertEquals("https://www.dice.com/about/contact-us" , title);
	}

	@Then("I should be able to click on send an email link")
	public void i_should_be_able_to_click_on_send_an_email_link() {
		ContactUsPage cup = new ContactUsPage();
		cup.sendAnEmailLink.click();
	}

	@Then("I should be able to clik on send an email button")
	public void i_should_be_able_to_clik_on_send_an_email_button() {
		ContactUsPage cup = new ContactUsPage();
		cup.sendAnEmailBtn.click();
	}
	
	

}
