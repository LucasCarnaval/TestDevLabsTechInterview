@signin
Feature: Signin automated tests for oracle page

  Scenario Outline: Invalid login with user
    Given User has opened Oracle Profile page
    When User inputs <email> as the email
    And User inputs <password> as the password
    And User presses the sing in button
    Then User sees invalid credentials message

    Examples:
      | email             | password      |
      | jhskfgj@gmail.com | Password123   |
      | 345njdf@gmail.com | Password1234  |
      | kfgm44@gmail.com  | Password12345 |
