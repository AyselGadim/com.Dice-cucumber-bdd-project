package com.dice.stepDefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.automationpractice.pojos.SalaryCalcInfo;
import com.dice.pages.SalaryCalculatorPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryCalculatorStepDefs {

	@Given("I am on homepage")
	public void iAmOnHomepage() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@When("I click on Career Explorer")
	public void iClickOnCareerExplorer() {
		new SalaryCalculatorPage().careerExplorer.click();
	}

	@When("I choose Salary Predictor")
	public void iChooseSalaryPredictor() {
		new SalaryCalculatorPage().salaryPredictor.click();
	}

	@Then("I should land on Salary Calculator page")
	public void iShouldLandOnSalaryCalculatorPage() {
		String actual = new SalaryCalculatorPage().headingText.getText();
		String expected = "How Much Are Your Skills Worth?";
		assertEquals(actual, expected);

	}

	@Given("I am on Salary Calculator page")
	public void iAmOnSalaryCalculatorPage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		new SalaryCalculatorPage().careerExplorer.click();
		new SalaryCalculatorPage().salaryPredictor.click();
	}

	@When("I add Salary Calculator Info")
	public void iFillInInformationFromExamplesTable(SalaryCalcInfo salaryCalc) throws InterruptedException {
		
		
		System.out.println("***************************");
		System.out.println(salaryCalc.toString());
		System.out.println(salaryCalc.getJobTitle());
		SalaryCalculatorPage page = new SalaryCalculatorPage();
		page.jobTitleField.sendKeys(salaryCalc.getJobTitle());
		Thread.sleep(2000);
		page.locationField.sendKeys(salaryCalc.getLocation());
		Thread.sleep(2000);
		page.yearsOfExperienceField.sendKeys(salaryCalc.getYearsOfExperience());
		Thread.sleep(2000);
		page.estimateSalaryButton.click();
		Thread.sleep(2000);
	}


	@Then("I should get the {string}")
	public void iShouldGetThe(String result) {
		SalaryCalculatorPage page = new SalaryCalculatorPage();
		String actual = page.locationInfo.getText();
		String expected = result; 
		assertTrue(actual.contains(expected));
		
	}
	

}
