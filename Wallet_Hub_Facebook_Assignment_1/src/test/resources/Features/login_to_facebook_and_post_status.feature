Feature: Facebook Login and Post a Status

  Scenario Outline: Login to Facebook and Post a Status
    Given user is on facebook login page
    When user inputs valid login credentials
    And click on login button
    Then user should be navigated to the dashboard
    And post a message "Hello World"