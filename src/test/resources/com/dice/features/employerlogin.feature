
Feature: Employer sign in feature
As a customer, I be able to reach employer sign in page
As a customer, I be able to use links on employer sign in page 
As a customer, I be able to sign in with valid credentials
As a customer, I be able to see forgot password link if I forgot sign in info





Scenario: Verify employer sign in title

Given I am on dice com
When I click on login dropdown
Then I click on employer login
Then I should land on employer sign in and the title should be dice employer sign in



Scenario: Verify employer sign in url


Given I am on dice com
When I click on login dropdown
Then I click on employer login
Then I should land on employer sign in page and the url should be correct


Scenario: Verify employer sign in page elements

Given I am on dice com
When I click on login dropdown
Then I click on employer login
Then The username, password, and sign in button elements should be enabled






















