
package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class JobListingsPage {

	public JobListingsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "/html/body/dhi-js-dice-client/div/dhi-search-page-container/dhi-search-page/div/dhi-search-page-results/div/div[3]/js-search-display/div/div[2]/dhi-search-cards-widget/div/dhi-search-card[1]/div/div[1]/div/div[2]/div[1]/h5/a")
	public WebElement jobTitle; 
	
	@FindBy(className = "jobTitle")
	public WebElement jobTitle2;
	
	@FindBy(className = "jobTitle")
	public WebElement descriptionJobTitle;
	
	@FindBy(id ="applybtn-2")
	public WebElement applyNowButton; 
	
	@FindBy(id = "easyapplyJob-log-in-btn")
	public WebElement signInButton; 
	
	@FindBy(id = "dropdownBtn")
	public WebElement shareButton;
	
	@FindBy(id = "dropdownBtn")
	public WebElement shareButton2;
	
	
	
	@FindBy(id = "emailBtn")
	public WebElement emailButton; 
	
	@FindBy(className = "modal-title")
	public WebElement emailThisJob;
	
	@FindBy (xpath = "//*[@id=\"bd\"]/div/div[2]/div[1]/div[3]/div")
	public WebElement diceID;
	

	@FindBy(id = "betaURL")
	public WebElement url;

	@FindBy(css = "button.d-lg-none.btn.btn-outline-primary.ng-star-inserted")
	public WebElement saveButton;

	@FindBy(id = "jobAlertSaveButton")
	public WebElement emailJobs;

	@FindBy(css = ".dropdown-label.ng-tns-c84-3")
	public WebElement filterResultsDropdown;

	@FindBy(id = "signBtnId")
	public WebElement singInButton;

	@FindBy(className = "modal-title")
	public WebElement singInToUseThisFeature;

	@FindBy(css = ".facet-group-header-text.ng-tns-c73-12")
	public WebElement remoteOptionsText;

	@FindBy(css = ".fa.fa-li.fa-square-o")
	public WebElement remoteOnly;

	@FindBy(css = ".ng-tns-c76-26.ng-star-inserted")
	public WebElement fullTime;

	public static void clickFilterResultsDropdown() {
		JobListingsPage jp = new JobListingsPage();
		jp.filterResultsDropdown.click();
	}

	public static void clickEmailJobs() {
		JobListingsPage jp = new JobListingsPage();
		jp.emailJobs.click();
	}

	public static void clickRemoteOnly() {
		JobListingsPage jp = new JobListingsPage();
		jp.remoteOnly.click();
	}

	public static void clickFullTime() {
		JobListingsPage jp = new JobListingsPage();
		jp.fullTime.click();
	}

}
