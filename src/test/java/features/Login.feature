Feature: This feature would be used to design the Login page of the Application

  @Sanity
  Scenario: Validate the successful login using Testdata
    Given I have opened the application in browser
    When I click on the Login link
    And I enter the username "mejoeljohny12@gmail.com"
    And I enter the password "Aneesh@123"
    And I click on the login button
    Then I should be Landed on the Home Page

  @Regression @Sanity
  Scenario: Validate the Negative login using Testdata
    Given I have opened the application in browser
    When I click on the Login link
    And I enter the username "negative@gmail.com"
    And I enter the password "Pa$$word@123"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @Regression @Rapid
  Scenario Outline: Validate the negative login using multiple Testdata
    Given I have opened the application in browser
    When I click on the Login link
    And I enter the username "<Username>"
    And I enter the password "<Password>"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."

    Examples: 
      | Username        | Password     |
      | Abc@gmail.com   | Pa$$word@123 |
      | fgr12@gmail.com | Pa$$word@123 |
