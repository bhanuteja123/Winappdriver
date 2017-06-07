@skype_test
Feature: Sign in


  Scenario Outline: user enter a valid user id password
    Given User Opens the Skype app
    Then  Verify the title of the page
    When  User give a valid username "<username>"
    Then  Verify the if the username got passed
    When  User give a valid  password "<password>"
    Then  Verify the title of the login page
    Examples:
      | username        |  | password   |
      | sssss@gmail.com |  | dfsdfsdfsf |