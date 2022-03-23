@signon
Feature: Signon automated tests for oracle page

  Scenario: Sign up with new user
    Given User has opened Oracle Profile page
    When User presses Create Account button
    And User fills out Create Account form
    And User presses Sign Up button
    Then User is redirected to Check Your Email page
