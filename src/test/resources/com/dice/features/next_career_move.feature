
Feature:  Next career move feature
As a customer, I be able to reach career path page
As a customer, I be able to fill the form 
As a customer, I be able to click explore career path button


Background:
Given I am on home page
When I click on career explorer
When I click on career paths


Scenario: Verify explore career paths feature

When I enter "sdet" to current job title field
And I enter "arlington" to location field
And I enter "3" to years of experience field
And I click on explore career paths button
Then I should land on your next career move page


	
	


































