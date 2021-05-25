Feature: Login

  Scenario Outline: Login to Facebook
    Given user is on the facebook login page
    When user enters email as "07051300357" and password as "olagoke89"
    And click on login button
    Then user should be navigated to the dashboard
    And post a message "Hello World"