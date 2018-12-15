Feature: Register an account on FreeCRM.

  Scenario: Register account
    Given open browser
    And I navigate to the FreeCRM
    And I click on Sign Up button
    When I provide firstname and lastname and email and confEmail and Username and Password and ConfirmPass
    And I click on agree terms and conditions
    Then User click on Submit button
    But I have to provide companyinfo and PhoneNumber and Email
    And I have to click Continue
    And I succesfully register my account
