@Skype_logout
Feature: Log out

  Scenario: User try to logout
    Given User Opens the Skype app
    Then  Verify the title of the Skype home page
    When  User logout