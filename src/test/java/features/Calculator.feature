Feature: This feature would be used to perform Calculator functions

  Scenario Outline: To Add
    Given I have Calculator
    When I add 3 and 5
    Then I should have result as 8

  Scenario: To Substract
    Given I have Calculator
    When I substract 10 and 5
    Then I should have result as 5

  Scenario Outline: To add two numbers using Scenario Outline
    Given I have Calculator
    When I add <num1> and <num2>
    Then I should have result as <result>

    Examples: 
      | num1 | num2 | result |
      |    2 |    3 |      5 |
      |    5 |    5 |     10 |

  Scenario Outline: To substract two numbers using Scenario Outline
    Given I have Calculator
    When I substract <num1> and <num2>
    Then I should have result as <result>

    Examples: 
      | num1 | num2 | result |
      |    2 |    3 |     -1 |
      |    5 |    5 |      0 |
      |    8 |    3 |      5 |

  Scenario: Add multiple numbers using Cucumber data table
    Given I have Calculator
    When I add the below numbers
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
    Then I should have result as 20

  Scenario: Add multiple numbers using Cucumber data table
    Given I have Calculator
    When I add the below numbers using List
      |  2 |
      |  3 |
      |  4 |
      |  5 |
      |  6 |
      | 10 |
    Then I should have result as 30

  Scenario: To calculate the total bill of an order
    Given I have Calculator
    When I order below items
      | Coffee | 10 |
      | Tea    | 10 |
      | Burger | 30 |
    Then I should have result as 50

  Scenario: To calculate the total bill of an order with quantity
    Given I have Calculator
    When I order below items with below quantity
      | Coffee | 1 | 10 |
      | Tea    | 2 | 10 |
      | Burger | 3 | 30 |
    Then I should have result as 120
