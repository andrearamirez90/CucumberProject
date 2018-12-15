Feature: Regsiter Account Without Examples Keyword

  Scenario: User Register Acct in FreeCRM
    Given open browser
    And I navigate to the FreeCRM
    And User clicks on Sign Up button
    When I provide "Andres" and "Moreno" and "email@email.com" and "email@email.com" and "andreaMore" and "admin123" and "admin123"
    And I click on agree terms and conditions
    Then User click on Submit button
    But I have to provide "company123" and "1234567890" and "email@email.com"
    And I have to click Continue
    And I succesfully register my account
