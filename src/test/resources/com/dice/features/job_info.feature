Feature: Job Description feature

@temp 
    Scenario: Verify job title
    
    Given I am on job listings page
    When I click on job title
    Then The job title should be correct on job description page
    
@temp    
    Scenario: Verify Apply Now Button
    
    Given I am on job listings page
    When I click on job title
    Then I should land on job description page and it should contain Apply Now Button 
    
    
    Scenario: Verify ID information
    
    Given I am on job listings page
    When I click on job title
    Then I should land on job description page and it should contain Job ID
    
    
     Scenario: Verify Share Icon
     
    Given I am on job description page
    When I click on Share Button
    Then I should get Email option 
    
 @temp   
    Scenario: Verify Apply Now Button for clickability 
    
    Given I am on job description page
    When I click on Apply Now Button
    Then I should get a pop up icon which contains Sign In Button
    
    
   
  
        
