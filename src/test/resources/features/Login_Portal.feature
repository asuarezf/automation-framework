@login-portal @regression

Feature: WebDrive University - Login Portal Page

  Background:
    Given I access the webdriver university login page


  Scenario Outline: Validate Successful Login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with a message <loginValidationMessage>

    Examples:
      | username    | password     | loginValidationMessage |
      | "webdriver" | webdriver123 | "validation succeeded" |
      | "username"  | web123       | "validation failed"    |

    @smoke @ignore
  Scenario Outline: Validate Successful Login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with a message <loginValidationMessage>

    Examples:
      | username    | password     | loginValidationMessage |
      | "webdriver" | webdriver123 | "validation succeeded" |
      | "username"  | web123       | "validation failed"    |
      | "username2" | web123       | "validation failed"    |
      | "username3" | web123       | "validation failed"    |
