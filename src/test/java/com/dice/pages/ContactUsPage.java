package com.dice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class ContactUsPage {
	
	public ContactUsPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
		
		@FindBy (xpath = "//div[@class = 'form-group']//input[@name='first-name']")
		public WebElement firstName;
		
		@FindBy (xpath = "//div[@class = 'form-group']//input[@name='last-name']")
		public WebElement lastName;
		
		@FindBy (id = "city")
		public WebElement city;
		
		@FindBy (id = "state")
		public WebElement state;
		
		@FindBy (id = "zip-code")
		public WebElement zipcode;
		
		@FindBy (xpath = "//div[@class = 'form-group']//input[@name='email']")
		public WebElement email;
		
		@FindBy (id = "subject")
		public WebElement subject;
		
		@FindBy (id = "user-message")
		public WebElement userMessage;
	
		@FindBy (xpath = "//ul[@class='list-unstyled']//a[contains(@href, '/about/contact-us')]")
		public WebElement contactUsLink;
	
		@FindBy (css = "a[href*='mailto'][class='btn btn-primary']")
		public WebElement sendAnEmailBtn;
		
		@FindBy (css = "a[href*='mailto'][class='contact-info-text']")
		public WebElement sendAnEmailLink;
		
		public static void clickSendAnEmailBtn() {
			ContactUsPage cup = new ContactUsPage();
			cup.sendAnEmailBtn.click();
		}
		
		
		public static void clickSendAnEmailLink() {
			ContactUsPage cup = new ContactUsPage();
			cup.sendAnEmailLink.click();
		}
		
		public static void clickContactUsLink() {
			ContactUsPage cup = new ContactUsPage();
			cup.contactUsLink.click();
		}
		
		
		
		
		
		
	
	
		

}
