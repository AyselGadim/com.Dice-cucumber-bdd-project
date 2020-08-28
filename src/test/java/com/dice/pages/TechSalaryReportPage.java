package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class TechSalaryReportPage {
	
	public TechSalaryReportPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy (xpath = "//div[@class='mt-5 pt-4']//a[contains(@href, '/techhub')]")
	public WebElement requestACopyBtn;

	@FindBy (id = "FirstName")
	public WebElement firstName;
	
	@FindBy (id = "LastName")
	public WebElement lastName;
	
	@FindBy (id = "Company")
	public WebElement company;
	
	@FindBy (id = "Email")
	public WebElement email;
	
	@FindBy (id = "ValidMsgEmail")
	public WebElement validMsgEmail;
	
	@FindBy (xpath = "//div[@class='mktoButtonRow']//button[@type = 'submit']")
	public WebElement getYourCopyBtn;

	

	public static void clickGetYourCopyBtn() {
		TechSalaryReportPage tsp = new TechSalaryReportPage();
		tsp.getYourCopyBtn.click();
	}
	
	public static void clickRequestACopyBtn() {
		TechSalaryReportPage tsp = new TechSalaryReportPage();
		tsp.requestACopyBtn.click();
	}
	

	
	
	
	
	
	

		
		
	
	
		

}
