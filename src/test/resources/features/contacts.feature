Feature: Free CRM Create Contacts

  Scenario Outline: Create Contact Scenario
Given I open browser
And I navigate to the FreeCRM
When I enter invalid "<username>" and "<password>" 
Then I click login button 
Then User is on home page
Then user moves to new contact page
Then user enter contact details "<firstname>" and "<lastname>" and "<position>" 

   
   
   

    Examples: 
      | username	  | password | firstname	 | lastname | position |
      | airmore15   | Cecan1991| John        | Smith    | manager  |
      | airmore15   | Cecan1991| John        | Smith    | manager  |
