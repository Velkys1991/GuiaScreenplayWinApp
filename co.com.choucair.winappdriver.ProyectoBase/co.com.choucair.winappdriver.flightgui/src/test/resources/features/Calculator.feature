Feature: I as a user want to perform a mathematical operation on the windows calculator
  Scenario: mathematical Operation
    Given that brandon wants to enter to use the Calculator
    When he enters the data into the calculator
      |valor1|valor2|valor3|
      |700   |50    |25    |
    Then he verifies that the result of the mathematical operation is equal to "Se muestra 30"