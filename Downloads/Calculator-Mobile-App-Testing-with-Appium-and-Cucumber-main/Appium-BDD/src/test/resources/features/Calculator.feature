Feature: CalculatorHomePage
  Scenario: Test Scenario
    Given I am in HomePage
    When Click calculator number 5
    And Click calculator operation "multiply"
    And Click calculator number 7
    And Click calculator operation "equals"
    Then Check result is 35