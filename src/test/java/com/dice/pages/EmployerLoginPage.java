package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class EmployerLoginPage {
	
	public EmployerLoginPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
}
	
	
	
	@FindBy (id = "username")
	public WebElement emailAddress;
	
	@FindBy (id = "password")
	public WebElement password;
	
	@FindBy(css = ".btn.btn-primary.sign-in-btn")
	public WebElement signInBtn;
	
	@FindBy(css = ".btn.btn-secondary.register-btn")
	public WebElement registerBtn;
	
	@FindBy (linkText ="Forgot your password")
	public WebElement forgotPasswordLink;
	
	
	public static void clickSignInBtn() {
		EmployerLoginPage elp = new EmployerLoginPage();
		elp.signInBtn.click();
	}
	
	public static void clickRegisterBtn() {
		EmployerLoginPage elp = new EmployerLoginPage();
		elp.registerBtn.click();
	}
	
	public static void clickForgotPassword() {
		EmployerLoginPage elp = new EmployerLoginPage();
		elp.forgotPasswordLink.click();
	}
	
	
	
	
	
	
	
	
	
	


}