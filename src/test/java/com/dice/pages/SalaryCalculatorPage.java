package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class SalaryCalculatorPage {
	
	public SalaryCalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "7navbarDropdown-3")
	public WebElement careerExplorer; 
	
	@FindBy(className = "dropdown-item")
	public WebElement salaryPredictor;
	
	@FindBy(className = "headingText")
	public WebElement headingText; 
	

}
