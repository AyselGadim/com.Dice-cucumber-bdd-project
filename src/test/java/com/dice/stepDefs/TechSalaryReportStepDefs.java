package com.dice.stepDefs;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.dice.pages.HomePage;
import com.dice.pages.TechSalaryReportPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;







public class TechSalaryReportStepDefs {
	TechSalaryReportPage tsp = new TechSalaryReportPage();
	
	@Given("I am on hiring page")
	public void i_am_on_hiring_page() {
		Driver.getDriver().manage().timeouts().
		   implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
		   Driver.getDriver().manage().window().maximize();
		   Driver.getDriver().get(ConfigReader.getProperty("url2"));
		}

	

	@When("I click on request a copy button")
	public void i_click_on_request_a_copy_button() {
		tsp.requestACopyBtn.click();
	}

	@Then("I should land on dice tech salary report page")
	public void i_should_land_on_dice_tech_salary_report_page() {
		String title = Driver.getDriver().getTitle();
		Assert.assertEquals("The Dice 2020 Tech Salary Report | eBook | Dice Resources" , title);
	}
	
	@Then("Firstname, last name, company, and email should be able to entered")
	public void information_should_be_able_to_enter () {
	
		Assert.assertTrue(tsp.firstName.isEnabled());
	    Assert.assertTrue(tsp.lastName.isEnabled()); 
	    Assert.assertTrue(tsp.company.isEnabled()); 
	    Assert.assertTrue(tsp.email.isEnabled());
	    
	}
	
	

	@Then("I enter {string} to firstName field")
	public void i_enter_to_first_name_field(String string) {
	
		tsp.firstName.sendKeys(string);
	}

	@Then("I enter {string} to last name field")
	public void i_enter_to_last_name_field(String string) {
		
		tsp.lastName.sendKeys(string);
	}

	@Then("I enter {string} to company field")
	public void i_enter_to_company_field(String string) {
		
		tsp.company.sendKeys(string);
	}

	@Then("I enter {string} to email field")
	public void i_enter_to_email_field(String string) {
		tsp.email.sendKeys(string);
	}


	@Then("I click on get your copy button")
	public void i_click_on_get_your_copy_button() {
		TechSalaryReportPage tsp = new TechSalaryReportPage();
		tsp.getYourCopyBtn.click();
	
	
	}
	


}
