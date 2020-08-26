package com.dice.stepDefs;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import com.dice.pages.SalaryCalculatorPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryCalculatorStepDefs {

	@Given("I am on homepage")
	public void iAmOnHomepage() {
		Driver.getDriver().manage().timeouts().implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")),
				TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@When("I click on Career Explorer")
	public void iClickOnCareerExplorer() {
		new SalaryCalculatorPage().careerExplorer.click();
	}

	@When("I choose Salary Predicor")
	public void iChooseSalaryPredicor() {
		new SalaryCalculatorPage().salaryPredictor.click();
	}

	@Then("I should land on Salary Calculator page")
	public void iShouldLandOnSalaryCalculatorPage() {

	}

	@Given("I am on Salary Calculator page")
	public void iAmOnSalaryCalculatorPage() {

		String actual = new SalaryCalculatorPage().headingText.getText();
		String expected = "How Much Are Your Skills Worth?";
		assertEquals(actual, expected);
	}

	@When("I fill in information from examples table")
	public void iFillInInformationFromExamplesTable() {
		
	}

	@Then("I verify if the Salary Calculator works properly")
	public void iVerifyIfTheSalaryCalculatorWorksProperly() {
		
	}
}
