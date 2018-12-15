Feature: sign up freecrm 

Scenario: sign uo to the freecrm 

		Given open browser
    And I navigate to the FreeCRM
    And User clicks on Sign Up button
    When I will provide the following details
    |EDITION 			| FNAME | LNAME | EMAIL 			| CONF.EMAIL	| USERNAME  | PASS 	 | CPASS		| CName |CEmail | Phone |
    |Free Edition | John  | smith | v@email.com | v@email.com | johnsmith250 	| a12234 | a12234   | Azul  | a@email.com	| 123456789|
    |Free Edition | Mike  | Bruce | h@email.com | h@email.com | mikebruce250 	| a12890  | a12890   | Verde | n@emial.com| 345633233|
      
    Then I close browser

