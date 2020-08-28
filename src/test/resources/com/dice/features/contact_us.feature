
Feature: Contact us page send an email button/link
As a customer, I be able to click send an email link in that page 
As a customer, I be able to click send an email button

	Background:
	
	Given I am at homepage
  When I click on contact us link
	Then I should land on contact us page

 
  Scenario: Send an email link
   
    Then I should be able to click on send an email link

  
  Scenario: Send an email button
   
    Then I should be able to clik on send an email button

 
