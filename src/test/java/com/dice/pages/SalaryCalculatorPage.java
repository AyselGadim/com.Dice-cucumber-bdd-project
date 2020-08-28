package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class SalaryCalculatorPage {
	
	public SalaryCalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "navbarDropdown-3")
	public WebElement careerExplorer; 
	
	@FindBy(xpath = "/html/body/header/nav/div/ul[1]/li[2]/div/a[1]")
	public WebElement salaryPredictor;
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div/div[1]/h1")
	public WebElement headingText; 
	
	@FindBy(id = "search-field-keyword")
	public WebElement jobTitleField;
	
	@FindBy(id = "search-field-location")
	public WebElement locationField;
	
	@FindBy(id = "search-field-exp-years")
	public WebElement yearsOfExperienceField;
	
	@FindBy(css = "#search-form > fieldset > div:nth-child(4) > div > div > button")
	public WebElement estimateSalaryButton; 
	
	@FindBy(css = "body > div.mkContent > div.containerColor > div.container.main-section > div > div.col-sm-12.col-lg-8.rightSection > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.skillsInclSec > div.mvSalaryPredict.scSalaryPredict.estimatedSalaryId.col-sm-12.col-lg-12.ng-binding")
	public WebElement SalaryPredictorResult; 
	
	@FindBy (xpath = "/html/body/div[6]/div[2]/div[1]/div/div[3]/div/div[1]/div[1]/h1")
	public WebElement locationInfo; 
	

}
