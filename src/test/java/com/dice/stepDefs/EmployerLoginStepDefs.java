package com.dice.stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.dice.pages.EmployerLoginPage;
import com.dice.pages.HomePage;
import com.dice.pages.LoginPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class EmployerLoginStepDefs {
	
	
	@Given("I am on dice com")
	public void i_am_on_dice_com() {
		
		
		Driver.getDriver().manage().timeouts().
		   implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
		   Driver.getDriver().manage().window().maximize();
		   Driver.getDriver().get(ConfigReader.getProperty("url"));
		}


	@When("I click on login dropdown")
	public void i_click_on_login_dropdown() {
		
		HomePage hp = new HomePage();
		hp.loginRegister.click();
	  
	}
	
	@Then("I click on employer login")
	public void i_click_on_log_in() {
		HomePage hp = new HomePage();
		hp.employerLogin.click();
		
	}
	
	
	@Then("I should land on employer sign in and the title should be dice employer sign in")
	public void i_Should_Land_On_Employer_Sign_In_And_The_Title_Should_Be_Dice_Employer_Sign_In() {
	   String title = Driver.getDriver().getTitle();
		Assert.assertEquals("Dice Employer Sign In" , title);
	}
		
	    
	
	
	@Then("I should land on employer sign in page and the url should be correct")
	public void i_should_land_on_employer_sign_in_page_and_the_url_should_be_correct() {
		String url = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.dice.com/employer/login?redirectUri=/employer/" , url);
	}
	
	@Then("The username, password, and sign in button elements should be enabled")
	public void the_username_password_and_sign_in_button_elements_should_be_enabled() {
	    EmployerLoginPage elp = new EmployerLoginPage();
	    Assert.assertTrue(elp.emailAddress.isEnabled());
	    Assert.assertTrue(elp.password.isEnabled()); 
	    Assert.assertTrue(elp.signInBtn.isEnabled()); 
	   
	}
	
	
	
}
