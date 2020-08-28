package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class HiringPage {
	
	public HiringPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}

		@FindBy (className = "btn btn-primary w-100 form-control")
		public WebElement GetInsights;
		
		
		
		
	
	
		

}
