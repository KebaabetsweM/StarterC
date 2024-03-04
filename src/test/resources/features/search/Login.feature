Feature: Claims Intimation


  Scenario Outline: Login into Life Claims
    Given a consultant opens claims website
    Then  log in using a policy number  '<PolicyNumber>'

    Examples:
      | PolicyNumber |
      | 123          |