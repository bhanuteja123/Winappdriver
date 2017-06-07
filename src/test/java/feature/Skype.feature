@skype
Feature: Diffrenet features


  Background: : user enter a valid user id password
    Given User Opens the Skype app
    Then  Verify the title of the page
    When  User give a valid username "surampudit@gmail.com"
    Then  Verify the if the username got passed
    When  User give a valid  password "Teja#1993"
    Then  Verify the title of the login page

    Scenario: Cheching the call feature
      Given User Opens the Skype app
      Then  Verify the title of the page
      When User click on the echo/Sound test
      Then vefify the echo page is opened
      When User press the call button
      Then verify the
      When User ends the call
      Then Verify if the echo page got opened