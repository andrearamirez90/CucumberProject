Feature: Login

Scenario: Valid Login
Given open browser
And I navigate to the FreeCRM
When I enter valid "airmore15" and "Cecan1991" 
And I click login button 
Then I succesfully logged in







#Scenario Outline: Invalid Login
#Given I open the browser
#And I navigate to the FreeCRM
#When I provide invalid "<username>" and "<password>" 
#And I click login button 
#Then I see error message 
#
#
#Examples:
#	| username | password |
#	|	andrea	 | Cecan1991|
#	| tomo     | admin122 | 