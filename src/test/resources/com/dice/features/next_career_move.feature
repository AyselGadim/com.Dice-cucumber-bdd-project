@temp
Feature:  Next career move feature
As a customer, I be able to reach career path page
As a customer, I be able to fill the form 
As a customer, I be able to click explore career path button



Scenario: Verify explore career paths feature

Given I am on career path page
When I enter "sdet" to current job title field
And I enter "arlington" to location field
And I enter "3" to years of experience field
And I click on explore career paths button
Then I should land on your next career move page


Scenario Outline: Verify explore career paths using multiple values

Given I am on career path page
When I enter "<currentJobTitle>" to current job title field
And I enter "<location>" to location field
And I enter "<yearsOfExperience>" to years of experience field
Then I should verify change on title based on current Job Title

Examples:

	|currentJobTitle|location |yearsofexperience|
	|QA							|Arlington|3								|
	|Developer			|Fairfax	|22								|
	|Sdet						|Bethesda	|12								|
	
	


































