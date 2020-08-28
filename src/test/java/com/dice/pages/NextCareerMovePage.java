package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class NextCareerMovePage {
	
	
	public NextCareerMovePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
		}
			@FindBy(id = "navbarDropdown-3")
			public WebElement careerExplorer; 
			
			@FindBy(xpath ="//div[@class='dropdown-menu show']//a[contains(@href, '/career-paths')]//span")
			public WebElement careerPaths; 
			
			@FindBy (id = "search-field-keyword")
			public WebElement CurrentJobTitle;
			
			@FindBy (id = "search-field-location")
			public WebElement location;
			
			@FindBy (id = "search-field-exp-years")
			public WebElement yearsOfExperience;
			
			@FindBy (xpath = "//button[@class = 'btn btn-default dropdown-toggle selectedSort ng-binding']")
			public WebElement SortCareerPathDropdown;
			
			@FindBy (xpath = "//div[@class='col-sm-12 col-sm-offset-0 col-xs-8 col-xs-offset-2']//button[@class = 'btn btn-primary btn-lg findValueBtn Button-Call-to-Action']")
			public WebElement ExploreCareerPathsBtn;
			
			public static void clickExploreCareerPathsBtn() {
				NextCareerMovePage ncmp = new NextCareerMovePage();
				ncmp.ExploreCareerPathsBtn.click();
			}
			
			public static void clickCareerPaths() {
				NextCareerMovePage ncmp = new NextCareerMovePage();
				ncmp.careerPaths.click();
			}
			
			
			
			
	
	
	
	
	

}
