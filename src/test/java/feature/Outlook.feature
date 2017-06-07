@test
Feature: Testing Windows application (Outlook)

  Scenario: Creating a new mail
    Given User opened the outlook application
    Then  Verify the title
    When  User Creates a new mail
    Then  Verify the title
    When  User click on sent mails
    Then  Verify the title
    Then Close the window