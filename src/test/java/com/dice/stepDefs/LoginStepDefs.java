package com.dice.stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.dice.pages.HomePage;
import com.dice.pages.LoginPage;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginStepDefs {
	
	
	@Given("I am at homepage")
	public void i_am_at_homepage() {
		
		
		Driver.getDriver().manage().timeouts().
		   implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
		   Driver.getDriver().manage().window().maximize();
		   Driver.getDriver().get(ConfigReader.getProperty("url"));
		}


	@When("I click on login register dropdown")
	public void i_click_on_login_register_dropdown() {
		
		HomePage hp = new HomePage();
		hp.loginRegister.click();
	  
	}
	
	@Then("I click on login")
	public void i_click_on_log_in() {
		HomePage hp = new HomePage();
		hp.login.click();
		
	}
	
	
	@Then("I should land on login page and the title should be sign in")
	public void i_should_land_on_login_page_and_the_title_should_be_sign_in() {
		String title = Driver.getDriver().getTitle();
		Assert.assertEquals("Sign In" , title);
	    
	}
	
	@Then("I should land on login page and the url should be correct")
	public void i_should_land_on_login_page_and_the_url_should_be_correct() {
		String url = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.dice.com/dashboard/login" , url);
	}
	
	@Then("The username, password, and log in button elements should be enabled")
	public void the_username_password_and_log_in_button_elements_should_be_enabled() {
	    LoginPage lp = new LoginPage();
	    Assert.assertTrue(lp.usernameField.isEnabled());
	    Assert.assertTrue(lp.passwordField.isEnabled()); 
	    Assert.assertTrue(lp.signInBtn.isEnabled()); 
	   
	   
	}
	
	
	
}
