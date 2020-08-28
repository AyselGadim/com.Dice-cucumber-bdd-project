package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
}

	
	@FindBy (xpath = "//div[@class = 'col-sm-8 col-md-8 col-lg-8']//input[@id = 'email']")
	public WebElement usernameField;
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (className = "btn-lg-valign")
	public WebElement forgotPasswordLink;
	
	
	@FindBy (linkText ="Employer Sign In" )
	public WebElement employerLink;
	
	@FindBy (partialLinkText ="Register")
	public WebElement registerLink;
	
	
	@FindBy(css = ".btn.btn-primary.btn-lg.btn-block")
	public WebElement signInBtn;
	
	public static void clickEmployerSignIn() {
		LoginPage lp = new LoginPage();
		lp.employerLink.click();
	}
	
	public static void clickRegister() {
		LoginPage lp = new LoginPage();
		lp.registerLink.click();
	}
	
	public static void clickSignInBtn() {
		LoginPage lp = new LoginPage();
		lp.signInBtn.click();
	}
	
	
	public static void clickForgotPasswordLink() {
		LoginPage lp = new LoginPage();
		lp.forgotPasswordLink.click();
	}
	
	
	
	


}