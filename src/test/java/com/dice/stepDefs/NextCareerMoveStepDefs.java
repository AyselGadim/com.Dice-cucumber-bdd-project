package com.dice.stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.dice.pages.NextCareerMovePage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NextCareerMoveStepDefs {
	NextCareerMovePage ncmp = new NextCareerMovePage();
	

@Given("I am on career path page")
public void i_am_on_career_path_page() {
		Driver.getDriver().manage().timeouts().
	   implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
	   Driver.getDriver().manage().window().maximize();
	   //Driver.getDriver().get(ConfigReader.getProperty("url10"));
	   Driver.getDriver("https://www.dice.com/career-paths");
}

@When("I enter {string} to current job title field")
public void i_enter_to_current_job_title_field(String string) {
  ncmp.CurrentJobTitle.sendKeys(string);
}

@And("I enter {string} to location field")
public void i_enter_to_location_field(String string) {
    ncmp.location.sendKeys(string);
}

@And("I enter {string} to years of experience field")
public void i_enter_to_years_of_experience_field(String string) {
    ncmp.yearsOfExperience.sendKeys(string);
}

@And("I click on explore career paths button")
public void i_click_on_explore_career_paths_button() {
    ncmp.ExploreCareerPathsBtn.click();
}

@Then("I should land on your next career move page")
public void i_should_land_on_your_next_career_move_page() {
	String title = Driver.getDriver().getTitle();
	Assert.assertEquals("How to Advance Your Career as a Sdet in Arlington | Dice.com" , title);
}

}
