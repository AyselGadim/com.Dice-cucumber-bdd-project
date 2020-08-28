package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class HomePage {
	
	public HomePage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
}

	
	@FindBy(id = "navbarDropdown-10")
	public WebElement loginRegister;
	
	
	@FindBy (xpath = "//div[@class='dropdown-menu show']//a[contains(@href, '/dashboard/login')]")
	public WebElement login;
	
	@FindBy (xpath = "//div[@class='dropdown-menu show']//a[contains(@href, '/employer')]")
	public WebElement employerLogin;
	
	@FindBy (xpath = "//div[@class='dropdown-menu show']//a[contains(@href, '/register')]")
	public WebElement register;
	
	public static void clicknavigationDropdown() {
		HomePage hp = new HomePage();
		hp.loginRegister.click();
	}
	
	
	
	public static void clickLogin() {
		HomePage hp = new HomePage();
		hp.login.click();
	}
	
	
	public static void clickEmployerLogin() {
		HomePage hp = new HomePage();
		hp.employerLogin.click();
	}
	
	public static void clickRegister() {
		HomePage hp = new HomePage();
		hp.register.click();
	}
	
	
	
	




}